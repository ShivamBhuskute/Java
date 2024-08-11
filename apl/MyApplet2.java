// import java.awt.Graphics;
// import java.applet.Applet;

// public class MyApplet2 extends Applet {
//     public void paint(Graphics g) {
//         g.drawOval(0, 0, 200, 200);
//         g.drawOval(50, 50, 100, 100);
//     }

//     public static void main(String[] args) {
//         // Create an instance of MyApplet2
//         MyApplet2 applet = new MyApplet2();

//         // Start the applet
//         applet.init();
//         applet.start();
//     }
// }


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApplet2 extends Frame {
    public void paint(Graphics g) {
        g.drawOval(0, 0, 200, 200);
        g.drawOval(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        // Create an instance of MyApplet2
        MyApplet2 frame = new MyApplet2();

        // Add a window listener to handle window closing
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set frame size and visibility
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
