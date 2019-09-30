package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet{

    public void init() {
        setSize(400,400);
    }

    public void paint(Graphics g) {
        //paal
        g.drawLine(200, 200, 200, 300 );
        //rechthoek
        g.drawRect(180, 100, 40, 100);
        //rood
        g.setColor(Color.RED);
        g.fillOval(185,105,30,30);
        //oranje
        g.setColor(Color.ORANGE);
        g.fillOval(185,135, 30,30);
        //groen
        g.setColor(Color.GREEN);
        g.fillOval(185,165,30,30);




    }
}
