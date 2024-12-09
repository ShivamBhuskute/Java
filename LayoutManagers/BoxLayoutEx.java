package LayoutManagers;

import javax.swing.*;
import java.awt.*;
public class BoxLayoutEx extends JFrame {
    BoxLayoutEx(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);
        Container c = getContentPane();

        BoxLayout boxlayout=new BoxLayout(c,BoxLayout.Y_AXIS); //Y_AXIS
        c.setLayout(boxlayout);

        JButton b1=new JButton("button1");
        JButton b2=new JButton("button2");
        JButton b3=new JButton("button3");
        JButton b4=new JButton("button4");

        //to change alignments
        b1.setAlignmentX(c.RIGHT_ALIGNMENT); //RIGHT_ALIGNMENT, CENTER_ALIGNMENT
        b2.setAlignmentX(c.RIGHT_ALIGNMENT);
        b3.setAlignmentX(c.RIGHT_ALIGNMENT);
        b4.setAlignmentX(c.RIGHT_ALIGNMENT);

        c.add(b1);
        //to create gap between b1 and b2
        c.add(Box.createRigidArea(new Dimension(0,50)));
        c.add(b2);
        c.add(b3);
        c.add(b4);
    }

    public static void main(String[] args) {
        BoxLayoutEx bl=new BoxLayoutEx();
    }
}
