package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Button knopOk;
    Label label;
    int tafel;
    String s, tekst;
    int teller = 1;

    public void init() {
        label = new Label("Voer tafel in.");
        add(label);

        tekstvak = new TextField(10);
        tekstvak.addActionListener( new tekstvakListener());
        add(tekstvak);

        knopOk = new Button("Ok");
        knopOk.addActionListener( new tekstvakListener());
        add(knopOk);
    }

    public void paint(Graphics g) {
        g.drawString("Tafel: " + tafel, 50, 70);

        int x = 50;
        int y = 100;

        for (teller = 1; teller < 11; teller++) {
            g.drawString( " " + (teller) + " x " + (tafel) + " = " + (teller * tafel), x, y);
            y += 20;
        }
    }

    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tafel = Integer.parseInt(s);
            repaint();
        }
    }

    class knopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        }
    }
}
