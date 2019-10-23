package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {


        public void init() {}

        public void paint(Graphics g) {
            int x = 0;
            int teller;

            for(teller = 0; teller < 10; teller ++) {
                x += 20;
                g.drawLine(x, 50, x, 300);
            }
        }
}
