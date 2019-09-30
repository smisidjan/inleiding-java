package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {


    public void init() {
        setSize(400,400);
    }


    public void paint(Graphics g) {
        //vierkant
        g.drawRoundRect(100,100,100,100,20,20);
        //linksboven
        g.fillOval(110, 110, 30,30);
        //linksonder
        g.fillOval(110, 160, 30,30);
        //rechtsboven
        g.fillOval(160, 110, 30,30);
        //rechtsonder
        g.fillOval(160,160,30,30);
    }
}
