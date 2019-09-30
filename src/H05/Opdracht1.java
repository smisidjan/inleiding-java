package H05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
        //declaratie.
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;

        public void init() {
            setSize(600,400);
            //initialisatie.
            opvulkleur = Color.MAGENTA;
            lijnkleur = Color.BLACK;
            breedte = 100;
            hoogte = 50;
        }

        public void paint(Graphics g) {
            //lijn
            g.drawLine(10,10,100,10);
            g.drawString("Lijn", 50,25);

            //rechthoek
            g.drawRect(10, 50, breedte, hoogte);
            g.drawString("Rechthoek",25,115 );


            //gevulde rechthoek met ovaal
            g.setColor(opvulkleur);
            g.fillRect(150, 50, breedte, hoogte);
            g.setColor(lijnkleur);
            g.drawOval(150, 50, breedte, hoogte);
            g.drawString("Gevulde rechthoek met ovaal", 120, 115);


            //taartpunt met ovaal eromheen
            g.setColor(opvulkleur);
            g.fillArc(325,50, breedte, hoogte, 0, 45);
            g.setColor(lijnkleur);
            g.drawOval(325,50, breedte, hoogte);
            g.drawString("Taartpunt met ovaal eromheen", 300, 115);


            //afgeronde rechthoek
            g.setColor(lijnkleur);
            g.drawRoundRect(10, 130, breedte, hoogte, 30, 30);
            g.drawString("Afgeronde rechthoek", 10, 200);


            //gevulde ovaal
            g.setColor(opvulkleur);
            g.fillOval(170, 130, breedte, hoogte);
            g.setColor(lijnkleur);
            g.drawString("Gevulde ovaal", 180, 200);


            //cirkel
            g.setColor(lijnkleur);
            g.drawOval(350,130, breedte, hoogte);
            g.drawString("Cirkel", 360, 200);


        }
    }

