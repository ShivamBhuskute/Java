import java.applet.Applet;
import java.awt.Graphics;
import java.awt.color;

public class MyApplet4 extends Applet {
    public void paint(Graphics g) {
        g.setcolor(Color.red);
        g.fillRect(5, 5, 90, 90);
        g.setcolor(Color.green);
        g.fillRect(105, 5, 90, 90);
        g.setcolor(Color.blue);
        g.fillRect(5, 105, 90, 90);
        g.setcolor(Color.yellow);
        g.fillRect(105, 105, 90, 90);
    }
}



