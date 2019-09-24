package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {
    //Variabelen declareren

    public void init(){
        //VARIABELEN INITIALISEREN

    }

    public void paint(Graphics g){
        //DINGEN IN BEELD BRENGEN
        g.setColor(Color.YELLOW);
        setBackground(Color.BLUE);
        g.fillOval(20, 20, 100, 50);
    }

}
