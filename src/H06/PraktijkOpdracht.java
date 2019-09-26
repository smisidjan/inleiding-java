package H06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
    double getal1, getal2, getal3, uitkomst;


    public void init() {
        getal1 = 5.9;
        getal2 = 6.3;
        getal3 = 6.9;

        uitkomst = (getal1 + getal2 + getal3) / 3;
        uitkomst *= 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + uitkomst, 20, 20);

    }
}
