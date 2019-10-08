package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Opdracht3 extends Applet {
        Double bedrag;
        TextField tekstvak;
        Button knopOk;
        Label label;
        String tekst;



    public void init() {
        setSize(400,400);


        label = new Label("Vul bedrag in");
        add(label);

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);

        knopOk = new Button("Ok");
        knopOk.addActionListener(new KnopOkListener());
        add(knopOk);

        tekst = "Prijs inclusief BTW (=21%): " + bedrag;


    }

    public void paint(Graphics g) {
        g.drawString(tekst, 20,100);
    }

        class KnopOkListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
             bedrag = Double.parseDouble(tekstvak.getText());
             tekst = "Prijs inclusief BTW (=21%): " + (bedrag* 1.21);
             repaint();
            }
        }

        class TekstvakListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                bedrag = Double.parseDouble(tekstvak.getText());
                tekst = "Prijs inclusief BTW (=21%): " + (bedrag* 1.21);
                repaint();

            }
        }
    }

