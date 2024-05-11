import java.applet.Applet;
import java.awt.Graphics;
public class MyApplet2 extends Applet{
    public void paint(Graphics g){
        g.drawOval(0, 0, 200, 200);
        g.drawOval(50, 50, 100, 100);
    }
}