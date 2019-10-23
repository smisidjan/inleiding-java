package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        int width = 50;
        int height = 50;
        int x = 50;
        int y = 50;

        for (int i = 0; i < 5; i++) {
            g.drawRect(x, y, width, height);
            x += 50;
            y += 50;

        }
    }
}
