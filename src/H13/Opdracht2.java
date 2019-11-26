package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setSize(600,400);
    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        int width = 40;
        int height = 20;

        tekenRodeMuur(g, x, y, width, height);
    }

    void tekenRodeMuur (Graphics g, int x, int y, int width, int height){
        for (int i = 0; i < 10; i++) {
            x = 20;
            for (int j = 0; j < 10; j++) {
                g.setColor(Color.red);
                g.fillRect(x, y, width, height);
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                x += width;
            }
            y += height;
        }
    }
}
