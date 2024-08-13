import java.awt.*;

class lect1 extends Frame {
    lect1() {
        Button b1 = new Button();
        add(b1);
        b1.setBounds(50, 100, 90, 30);
        setSize(90, 30);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        lect1 l = new lect1();
    }
}