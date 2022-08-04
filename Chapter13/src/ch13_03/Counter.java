package ch13_03;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Counter extends JFrame implements ActionListener {
    private JLabel[] labels;
    private JButton button;
    private int[] numbers;
    private JLabel label;

    public Counter() {
        setSize(500, 300);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        labels = new JLabel[3];
        numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            labels[i] = new JLabel("" + numbers[i]);
            labels[i].setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));

            labels[i].setSize(100, 100);
            labels[i].setLocation(100 + 100 * i, 20);

            panel.add(labels[i]);
        }
        label = new JLabel("000");
        label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
        label.setSize(350, 80);
        label.setLocation(100, 190);
        panel.add(label);

        button = new JButton("스핀");
        button.setSize(250, 50);
        button.setLocation(100, 150);
        panel.add(button);
        button.addActionListener(this);

        add(panel);
        setTitle("이세령_2021250005");
        setVisible(true);
    }


    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i < 3; i++) {
            numbers[i] = (int) (Math.random() * 10);
            labels[i].setText(" " + numbers[i]);
        }
        if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
            label.setText("100");
        }
    }
}


class SlotMachineTest {
    public static void main(String[] args) {
        new Counter();
    }
}
