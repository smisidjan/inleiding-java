package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet{
    int seconden, uur, dag, jaar;

    public void init() {
        seconden = 60;
        uur = 60 ;
        dag = 24;
        jaar = 365;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur: " + seconden * 60, 20, 20);
        g.drawString("Seconden in een dag: " + seconden * uur * dag, 20, 35);
        g.drawString( "Seconden in een jaar: " + jaar * 86400, 20, 50);

    }
}