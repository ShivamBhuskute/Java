package LayoutManagers;
import javax.swing.*;
import java.awt.*;
public class CardLayoutEx extends JFrame {
    CardLayoutEx() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);
        Container c = getContentPane();

        CardLayout card=new CardLayout();
        c.setLayout(card);

        JButton b1=new JButton("page1");
        JButton b2=new JButton("page2");
        JButton b3=new JButton("page3");
        JButton b4=new JButton("page4");

        c.add(b1,"1");
        c.add(b2,"2");
        c.add(b3,"3");
        c.add(b4,"4");

        card.first(c);
        card.next(c);
        card.previous(c);

//        card.last(c);

        //show method
//        card.show(c,"3");
    }

    public static void main(String[] args) {
        CardLayoutEx cl=new CardLayoutEx();
    }
}
