package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    int[] getallen = new int[11];
    double totaal = 0;

    public void init() {

        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < getallen.length; i++) {
            totaal += getallen[i];
        }
        System.out.println("Totaal is:" + totaal );
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;

        for (int i = 0; i < getallen.length; i++) {
            g.drawString("Random getallen: ", 50, 30);
            g.drawString("" + getallen[i] + ",", x, y);
            x += 20;
            g.drawString("Gemiddelde random getallen: " + totaal / 10, 50, 100);
        }
    }
}

