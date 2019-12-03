package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Opdracht1 extends Applet implements ActionListener {
    int randomKleuren, randomKaarten;
    Button knopDeelKaarten;
    String[] kleuren;
    String[] kaarten;
    int aantal = 0;


    public void init() {
        kleuren = new String[] {"Klaver", "Ruiten", "Harten", "Schoppen"};
        kaarten = new String[] {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen",
                "tien", "boer", "vrouw", "koning", "aas"};

        knopDeelKaarten = new Button("Deel kaarten");
        knopDeelKaarten.addActionListener(this);
        add(knopDeelKaarten);
        
    }

    public void paint(Graphics g) {

        if ( aantal == 1) {
            g.drawString(" " + kleuren[randomKleuren] + "  " + kaarten[randomKaarten], 20, 50);
        }
    }

    public void actionPerformed(ActionEvent e) {
        Random r = new Random();

        for (int i = 0; i < 1; i++) {
            randomKleuren = r.nextInt(kleuren.length);
            System.out.println(kleuren[randomKleuren]);
            randomKaarten = r.nextInt(kaarten.length);
            System.out.println(kaarten[randomKaarten]);
            aantal = 1;
        }
        repaint();
    }
}
