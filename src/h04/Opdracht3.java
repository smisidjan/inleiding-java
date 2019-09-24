package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet{
    public void init() {
        setSize(200, 200);
    }

    public void paint(Graphics g) {
        // vlaggenstok
        g.drawLine(49, 49, 49, 149);
        //bovenste rechthoek
        g.setColor(Color.RED);
        g.fillRect( 50, 50, 100, 15);
        //middelste rechthoek
        g.setColor(Color.WHITE);
        g.fillRect(50, 65, 100, 15);
        // onderste rechthoek
        g.setColor(Color.BLUE);
        g.fillRect(50, 80, 100, 15);


    }
}
