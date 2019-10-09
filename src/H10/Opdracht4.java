package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;

    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het jaartal" +
                " in en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100  == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar dus 29 dagen in de maand februari";
            } else {
                tekst = "" + jaartal + " is geen schrikkeljaar dus 28 dagen in de maand februari";
            }
            repaint();


        }
    }

}