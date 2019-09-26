package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int getal1, getal2;

    public void init() {
        getal1 = 15;
        getal2 = 30;

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " +(getal1 - getal2), 20, 20 );

    }
}
