package ch12_03;

import ch12_01.SimpleGui3C;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame("이세령_2021250005");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);


        for (int i = 0; i < 130; i++) {
            x++;
            y++;

            drawPanel.repaint();

            try{
                Thread.sleep(50);
            }catch (Exception ex){}
        }
    }

    class MyDrawPanel extends JPanel{

        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);
            g.setColor(Color.black);
        }
    }
}
