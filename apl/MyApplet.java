package apl;

import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet
{
    String s = " ";
    public void destroy(){
        s = s+"destroy";
        showStatus(s);
    }
    public void paint (Graphics g){
        s = s+"paint";
        showStatus(s);
    }
    public void stop(){
        s = s +"stop";
        showStatus(s);
    }
    public void start(){
        s = s +"start";
        showStatus(s);
    }
    public void init(){
        s  = s+"init";
        showStatus(s);
    }
}

