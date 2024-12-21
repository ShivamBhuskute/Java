import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonEvent1 extends JFrame implements ActionListener {
    Container c;
    JButton jb;

    JButtonEvent1() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        jb = new JButton("Click Here");
        jb.setBounds(100, 100, 100, 30);
        c.add(jb);
        jb.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new JButtonEvent1();
    }
}
