package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setSize(200, 200);
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        // linker lijn
        g.drawLine(50, 100, 100, 50);
        //rechter lijn
        g.drawLine(100, 50, 150, 100);
        //Horizontale lijn
        g.drawLine(50, 100, 150, 100);


    }
}