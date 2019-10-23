package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
        setSize(1000,1000);
    }


    public void paint(Graphics g) {
        int width = 20;
        int height = 20;
        int x = 250;
        int y = 250;

        for (int i = 0; i < 50; i++) {
            g.drawOval(x, y, width, height);
            width += 10;
            height += 10;
            x -= 5;
            y -= 5;


        }
    }
}