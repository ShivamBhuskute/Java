

import java.awt.*;

/**
 * lect2
 */
class lect2 {
    lect2() {
        Frame f1 = new Frame();
        Label l = new Label("stud_id");
        Button b = new Button("Submit");
        TextField t = new TextField();

        l.setBounds(20, 80, 80, 30);
        b.setBounds(20, 120, 80, 30);
        t.setBounds(100, 120, 80, 30);

        f1.add(l);
        f1.add(b);
        f1.add(t);
        
        f1.setSize(400, 500);

        f1.setTitle("AWT");
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        lect2 l = new lect2();
    }
}