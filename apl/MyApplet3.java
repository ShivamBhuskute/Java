import apl
;
import java.applet.Applet;
import java.awt.Graphics;
public class MyApplet3 extends Applet{
    public void paint(Graphics g){
       g.fillRect(5, 5, 90, 90);
       g.fillRect(105, 5, 90, 90);
       g.fillRect(5, 105, 90, 90);
       g.fillRect(105, 105, 90, 90);
    }
}