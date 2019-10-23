package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {
        setSize(500,500);
    }


    public void paint(Graphics g) {
        int x = 250;
        int y = 250;
        int width = 50;
        int height = 50;

        for (int i = 0; i < 5; i++) {
            g.drawOval(x, y, width, height);
            width += 50;
            height += 50;
            x -= 25;
            y -= 25;

        }
    }
}

