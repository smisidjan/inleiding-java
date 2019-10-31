package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    TextField tekstvak;
    Label label;
    Button knopGeslaagd;
    String s, tekst;
    double cijfers, optelsom, gemiddelde;
    int aantal;


    public void init() {
        label = new Label("Typ je cijfer in");
        add(label);

        aantal = 0;
        optelsom = 0;

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);

        tekst = "...";

        knopGeslaagd = new Button("Ben ik geslaagd?");
        knopGeslaagd.addActionListener(new KnopGeslaagdListener());
        add(knopGeslaagd);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100);
        g.drawString("" + gemiddelde, 50, 120);
        
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal++;
            System.out.println(aantal);

            s = tekstvak.getText();
            cijfers = Double.parseDouble(s);

            optelsom += cijfers;
            System.out.println(optelsom);

            if (cijfers < 5.5) {
                tekst = "Onvoldoende.";
                repaint();
            } else {
                tekst = "Voldoende.";
                repaint();
            }

        }
    }


        class KnopGeslaagdListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                gemiddelde = optelsom / aantal;
                gemiddelde *= 10;
                gemiddelde = (int) gemiddelde;
                gemiddelde = gemiddelde / 10;

                if (gemiddelde < 5.5){
                    tekst = "Niet geslaagd.";
                } else {
                    tekst = "Geslaagd.";
                }
                repaint();
            }
        }

}
