package H13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht2 extends Applet {
    public void init() {
        setSize(600, 1000);
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
        for (int i = 0; i < 5; i++) {
            x = 80;
            x2 = 55;
            for (int j = 0; j < 5; j++) {
                g.setColor(Color.PINK);
                g.fillRect(x, y, width, height);
                g.setColor(Color.green);
                g.fillOval(x2, y2, width2, height2);
                x += 100;
                x2 += 100;
            }
            y += 100;
            y2 += 100;
        }
    }
}
