package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.Color;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int x = 80;
        int y = 40;
        int x2 = 55;
        int y2 = 20;
        int width = 25;
        int height = 90;
        int widht2 = 80;
        int height2 = 60;

        tekenBoom(g, x, y, width, height, x2, y2, widht2, height2);

    }

    void tekenBoom(Graphics g, int x, int y, int width, int height, int x2, int y2, int width2, int height2){
        g.setColor(Color.PINK);
        g.fillRect(x, y, width, height);
        g.setColor(Color.green);
        g.fillOval(x2, y2, width2, height2);
    }
}
