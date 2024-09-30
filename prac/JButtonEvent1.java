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
        c.setBackground(Color.GRAY);

        jb = new JButton("Click here");
        jb.setBounds(170, 150, 200, 50);
        c.add(jb);

        jb.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.BLACK);
        jb.setText("Color changed");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JButtonEvent1 jb = new JButtonEvent1();
    }

}
