// package SWING;

import javax.swing.*;
import java.awt.*;

public class b extends JFrame {
    b() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        setTitle("SWING");

        Container c = getContentPane();
        setLayout(new FlowLayout());
        c.setBackground(Color.pink);

        // setResizable(false);

        JLabel j = new JLabel("Username");
        Font f = new Font("Arial", Font.ITALIC, 30);

        j.setFont(f);
        j.setBackground(Color.red);
        j.setForeground(Color.white);

        c.add(j);


    }
    public static void main(String[] args) {
        new b();
    }
}
