package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {


    public void init() {
        setSize(600,400);

    }


    public void paint(Graphics g) {
        //lijn
        g.drawLine(10,10,100,10);
        g.drawString("Lijn", 50,25);

        //rechthoek
        g.drawRect(10,50,100,50);
        g.drawString("Rechthoek",25,115 );

        //gevulde rechthoek met ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(150, 50, 100,50);
        g.setColor(Color.BLACK);
        g.drawOval(150, 50,100,50);
        g.drawString("Gevulde rechthoek met ovaal", 120, 115);

        //taartpunt met ovaal eromheen
        g.drawOval(325,50,100,50);
        g.setColor(Color.MAGENTA);
        g.fillArc(325,50,100,50,0,45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen", 300, 115);

        //afgeronde rechthoek
        g.drawRoundRect(10,130, 100,50,30,30);
        g.drawString("Afgeronde rechthoek", 10, 200);

        //gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(170, 130, 100,50);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal", 180, 200);

        //cirkel
        g.drawOval(350, 130, 50,50);
        g.drawString("Cirkel", 360, 200);






















    }
}
