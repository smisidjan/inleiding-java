package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {}


    public void paint(Graphics g) {
        int teller = 1;
        int x = 50;
        int y = 50;
        int tafel = 3;



        for (teller = 1; teller < 11; teller++) {
            g.drawString(" " + (teller * tafel), x, y);
            x += 20;
        }


        //while (teller <11) {
           // x += 20;
         //   g.drawString(" " + (teller * tafel), x, y);
         //   teller++;
    //}
    }
}
