package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    Button[] knop;


    public void init() {
        knop = new Button[26];

        for (int i = 1; i < knop.length; i++) {

            knop[i] = new Button(String.valueOf(i));
            System.out.println(knop[i]);
            add(knop[i]);
        }

    }

    public void paint(Graphics g) {

    }
}
