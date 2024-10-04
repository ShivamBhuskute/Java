import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class c extends JFrame implements ActionListener {
    Container c;
    JButton jb, jb1, jb2;

    c() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        setTitle("SWING");

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        jb = new JButton("Click here");
        jb.setBounds(100, 100, 100, 30);
        jb1 = new JButton("Click here");
        jb1.setBounds(250, 100, 100, 30);
        jb2 = new JButton("Click here");
        jb2.setBounds(400, 100, 100, 30);

        c.add(jb);
        c.add(jb1);
        c.add(jb2);

        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb) {
            c.setBackground(Color.pink);
        } else if (e.getSource() == jb1) {
            c.setBackground(Color.red);
        } else {
            c.setBackground(Color.white);
        }
    }

    public static void main(String[] args) {
        new c();
    }
}
