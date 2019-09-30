package H05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    int hoogteXas;


    public void init() {
        setSize(400,400);
        hoogteXas = 350;
        gewichtValerie = 45;
        gewichtJeroen = 100;
        gewichtHans = 80;
    }


    public void paint(Graphics g) {
        //verticale as
        g.drawLine(50,50,50,hoogteXas);
        //horizontale as
        g.drawLine(50,hoogteXas,hoogteXas,hoogteXas);

        // tekenen van de staven
            //1. valerie
        g.setColor(Color.BLUE);
        g.fillRect(50, hoogteXas - gewichtValerie, 80, gewichtValerie);
            //2. jeroen
        g.setColor(Color.GRAY);
        g.fillRect(130, hoogteXas - gewichtJeroen, 80, gewichtJeroen);
            //3. hans
        g.setColor(Color.PINK);
        g.fillRect(210, hoogteXas - gewichtHans, 80, gewichtHans);
    }
}
