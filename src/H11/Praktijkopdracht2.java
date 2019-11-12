package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2 extends Applet {
    Label label;
    Button knopOk;
    int tafel;

    public void init() {

        label = new Label("Klik op de knop voor de volgende tafel.");
        add(label);

        knopOk = new Button( "OK");
        knopOk.addActionListener( new knopOkListener());
        add(knopOk);

    }

    public void paint(Graphics g) {
        int x = 170;
        int y = 70;

        for ( int teller = 1; teller < 11; teller++) {
            g.drawString( " " + (teller) + " x " + (tafel) + " = " + (teller * tafel), x, y);
            y += 20;
        }
    }

    class knopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            if ( tafel < 10) {
                tafel++;
                repaint();
            } else {
                tafel = 1;
                repaint();
            }
        }
    }
}
