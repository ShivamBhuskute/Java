import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class practice extends JFrame {
    practice() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        Container c = getContentPane();

        JLabel l1 = new JLabel("Username");
        l1.setBounds(50, 10, 200, 30);
        c.add(l1);
        c.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new practice();
    }

}
