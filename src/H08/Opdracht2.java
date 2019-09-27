package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    Button knopMannen;
    Button knopVrouwen;
    Button knopJongens;
    Button knopMeisjes;

    String kopTekst, tekstMannen, tekstVrouwen, tekstMeisjes, tekstJongens;

    int aantalMannen, aantalVrouwen, aantalMeisjes, aantalJongens, totaal;

    public void init(){
        knopMannen = new Button("Mannen");
        knopMannen.addActionListener(new knopMannenListener());
        add(knopMannen);

        knopVrouwen = new Button("Vrouwen");
        knopVrouwen.addActionListener(new knopVrouwenListener());
        add(knopVrouwen);

        knopMeisjes = new Button("Meisjes");
        knopMeisjes.addActionListener(new knopMeisjesListener());
        add(knopMeisjes);

        knopJongens = new Button("Jongens");
        knopJongens.addActionListener(new knopJongensListener());
        add(knopJongens);
    }

    public void paint(Graphics g) {
        g.drawString("Aantal Mannen: " + aantalMannen, 20, 150);
        g.drawString("Aantal Vrouwen: " + aantalVrouwen, 20, 165);
        g.drawString("Aantal Meisjes: " + aantalMeisjes, 20, 180);
        g.drawString("Aantal Jongens: " + aantalJongens, 20, 195);
        g.drawString("Totaal aantal mensen: " + totaal, 20, 110);


    }

    class knopMannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalMannen = aantalMannen + 1 ;
            totaal = totaal + 1;
            repaint();
        }
    }

    class knopVrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalVrouwen = aantalVrouwen + 1;
            totaal = totaal + 1;
            repaint();

        }
    }

    class knopMeisjesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalMeisjes = aantalMeisjes + 1;
            totaal = totaal + 1;
            repaint();

        }
    }

    class knopJongensListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalJongens = aantalJongens + 1;
            totaal = totaal + 1;
            repaint();

        }
    }
}










