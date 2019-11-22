package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet implements ActionListener {
    TextField tekstvak;
    Button knopOk;
    boolean isGevonden;
    String tekst;
    int getal;
    int [] tabel;

    public void init() {

       tabel = new int [ 15];
       for (int i = 0; i < tabel.length; i++) {
           tabel[i] = (int) (Math.random() * 10 + 1);
     }

        tekstvak = new TextField(5);
        add(tekstvak);

        knopOk = new Button("OK");
        knopOk.addActionListener(this);
        add(knopOk);

        isGevonden = false;
    }

    public void paint(Graphics g) {
        int x = 30;

        for (int i = 0; i < tabel.length; i++) {
            g.drawString( " " + tabel[i], x, 70);
            x += 20;
        }
        g.drawString(" " + tekst, 100, 100);
    }

    public void actionPerformed(ActionEvent e) {
        boolean isGeklikt = false;
        getal = Integer.parseInt(tekstvak.getText());
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] == getal) {
                isGevonden = true;
                tekst = getal + " is gevonden op index: " + i;
                break;
            }
            if (isGevonden){
                tekst = getal + " is niet gevonden.";
            }
        }
        repaint();
    }
}

