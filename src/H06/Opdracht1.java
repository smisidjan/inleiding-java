package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
        double Jan, Ali, Jeannette, Sarai ;
        double uitkomst;

    public void init() {
        uitkomst = 113;

    }

    public void paint(Graphics g) {
        g.drawString(" Jan :" + uitkomst / 4 , 20, 20);
        g.drawString(" Ali :" + uitkomst / 4 , 20, 40);
        g.drawString(" Jeannette :" + uitkomst / 4 , 20, 55);
        g.drawString(" Sarai :" + uitkomst / 4 , 20, 70);

    }
}
