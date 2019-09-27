package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {
    //VARIABELEN DECLAREREN
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    // int hoogteXas;

    public void init(){

        //VARIABELEN INITIALISEREN

        setSize(400,400);
        // hoogteXas = 350;
        gewichtValerie = 45;
        gewichtJeroen = 100;
        gewichtHans = 80;

    }

    public void paint(Graphics g){

        //DINGEN IN BEELD BRENGEN

        // Verticale as
        g.drawLine(50,50, 50, 350);
        // Horizontale as
        g.drawLine(50, 350, 350, 350);

        // Tekenen van de staven
            //1. Valerie
        g.setColor(Color.PINK);
        g.fillRect(50, 305, 80, 45 );
        g.drawString( "Valerie", 60, 365);

            //2. Jeroen
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(130, 250, 80, 100);
        g.drawString("Jeroen", 140, 365);

            //3. Hans
        g.setColor(Color.BLUE);
        g.fillRect(210, 270, 80, 80);
        g.drawString("Hans", 230, 365 );

        // Verdeling staafdiagram
        g.setColor(Color.black);
        g.drawString("0", 40, 350);
        g.drawString("20", 35, 330);
        g.drawString("40", 35, 310);
        g.drawString("60", 35, 290);
        g.drawString("80", 35, 270);
        g.drawString("100", 28, 250);
        g.drawString("120", 28, 230);
        g.drawString("140", 28, 210);
        g.drawString("160", 28, 190);
        g.drawString("180", 28, 170);
        g.drawString("200", 28, 150);

    }

}
