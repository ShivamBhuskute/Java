import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bgChange extends JFrame implements ActionListener {
    Container c;
    JButton jb, jb1, jb2;

    bgChange() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        jb=new JButton("Click here");
        jb.setBounds(100, 100, 100, 30);
        jb1=new JButton("Click here 1");
        jb1.setBounds(200, 100, 100, 30);
        jb2=new JButton("Click here 2");
        jb2.setBounds(300, 100, 100, 30);

        c.add(jb);
        c.add(jb1);
        c.add(jb2);

        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb) {
            c.setBackground(Color.PINK);
        }
        if(e.getSource() == jb1) {
            c.setBackground(Color.ORANGE);
        }
        if(e.getSource() == jb2) {
            c.setBackground(Color.DARK_GRAY);
        }
    }

    public static void main(String[] args) {
        bgChange te = new bgChange();
        bgChange jb1 = new bgChange();
        bgChange jb2 = new bgChange();
    }

}