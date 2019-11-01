package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int[] fibonacci;


    public void init() {
        fibonacci = new int[1000];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < 1000; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
    }

    public void paint(Graphics g) {
        int x = 50;

        for (int i = 0; i < 20; i++) {
            g.drawString("" + fibonacci[i] + ",", x, 20);
            x += 35;
        }
    }
}

