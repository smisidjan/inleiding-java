package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x1 = 20;
        int y1 = 80;
        int x2 = 100;
        int y2 = 80;
        int x3 = 60;
        int y3 = 20;

        tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
    }

    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);
    }
}
