/*
Author: Seryeoung Lee
Email: srlimvp@gmail.com
Course: Java Programming
Assignment: Programming Assignment 2
Due date: 05/29/2021
File: VirtualMathTutor.java
Purpose: Java application that implements an Virtual Math Tutor
Compiler/IDE: Java SE Development Kit 8u181/IntelliJ IDEA
Operating system: MS Windows 10
Reference(s): Java 8 API
Oracle Documentation
(http://docs.oracle.com/javase/8/docs/api/ api/);
(Include ALL additional references (Web page, etc.) here.)
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MathTutorTest{
    public static void main(String[] args) {
        new VirtualMathTutor().buildGUI();
    }
}

public class VirtualMathTutor{

    int p, op1, op2, sa, re;
    String a;

    private JFrame frame;
    private JButton button1;
    private JButton button2;
    private JTextField textField;
    private JLabel problem;
    private JLabel result;
    static int t = 0;

    /*GUI를 구성하는 메소드*/
    public void buildGUI(){
        frame = new JFrame("이세령_2021250005");
        JPanel mpanel = new JPanel();
        JPanel spanel = new JPanel();

        button1 = new JButton("New Problem");
        button1.addActionListener(new ProblemListener());
        button2 = new JButton("enter");
        button2.addActionListener(new EnterListener());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        generateProblem();
        problem = new JLabel(); //문제 라벨
        problem.setText("How much is " + String.valueOf(op1) + " " + a + " " + String.valueOf(op2) + "?");

        result = new JLabel("Please enter your answer"); //입력요청과 답에대한 라벨(정답 시 시도한 수도 출력)

        textField = new JTextField(5);
        textField.setText("");

        mpanel.setLayout(new BoxLayout(mpanel, BoxLayout.Y_AXIS));
        mpanel.add(problem);

        spanel.add(result);
        spanel.add(textField);

        mpanel.add(spanel);
        mpanel.add(button1);
        spanel.add(button2);

        frame.add(mpanel, BorderLayout.NORTH);
        frame.setSize(350, 150);
        frame.setVisible(true);
    }

    /*수학 문제를 생성*/
    public void generateProblem() {
        p = (int) (Math.random() * 2 + 1);
        op1 = (int) (Math.random() * 9 + 1);
        op2 = (int) (Math.random() * 9 + 1);

        if (p == 1) {
            a = "times";
            re = op1 * op2;
        }
        if (p == 2) {
            a = "minus";
            re = op1 - op2;
        }
        if (p == 3) {
            a = "puls";
            re = op1 + op2;
        }
    }

    /*학생의 답변 등을 확인*/
    public void checkAnswer(int userAnswer) {
        sa = userAnswer;
    }

    /* 답을 확인하는 버튼이 클릭되면 수행 textfield에서 입력된 값을 확인하고 답을 맞춘 후 결과에 따른 문구를 출력*/
    public class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            checkAnswer(getTextField());
            if (sa == re) {
                result.setText("Very good! It only took you " + t + " try.");
            }
            if (sa != re) {
                result.setText("I'm sorry, but no. Please try again.");
            }
            textField.setText("");
            t++; //몇번 시도되었는지 확인
        }
    }

    /*텍스트 값을 정수로 받아들임*/
    public int getTextField(){
        return Integer.parseInt(textField.getText());
    }

    /*새 문제를 만드는 버튼이 클릭되면 다른 문제 출력*/
    public class ProblemListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            t = 0; //시도 된 수를 초기화
            frame.dispose();
            buildGUI();
        }
    }
}


