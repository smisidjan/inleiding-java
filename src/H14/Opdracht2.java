package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class Opdracht2 extends Applet {
    Button knopDeelKaarten;
    int alleSpelers;
    boolean deelKaarten;

    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;
    String[] deck;
    String[] kleuren;
    String[] kaarten;

    private URL pad;
    private AudioClip sound;

    public void init() {
        setSize(650, 600);

        pad = Opdracht2.class.getResource("/recources/");
        sound = getAudioClip(pad, "applaus.wav");

        knopDeelKaarten = new Button("Deel kaarten");
        knopDeelKaarten.addActionListener(new knopListener());
        add(knopDeelKaarten);

        deelKaarten = false;
    }

    public void paint(Graphics g) {
        int speler1x = 50, speler2x = 200, speler3x = 350, speler4x = 500, y = 100;

        if (deelKaarten == true) {
            sound.play();
            for (int i = 0; i < speler1.length; i++) {
                if (i == 0) {
                    g.drawString("Speler 1: ", speler1x, y);
                    g.drawString("Speler 2: ", speler2x, y);
                    g.drawString("Speler 3: ", speler3x, y);
                    g.drawString("Speler 4: ", speler4x, y);
                    y += 30;
                }
                g.drawString("" + speler1[i], speler1x, y);
                g.drawString("" + speler2[i], speler2x, y);
                g.drawString("" + speler3[i], speler3x, y);
                g.drawString("" + speler4[i], speler4x, y);
                y += 30;
            }
        }
    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            deelKaarten = true;
            int teller1 = 0, teller2 = 0;

            kleuren = new String[]{"Klaver", "Ruiten", "Harten", "Schoppen"};
            kaarten = new String[]{"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen",
                    "tien", "boer", "vrouw", "koning", "aas"};

            speler1 = new String[13];
            speler2 = new String[13];
            speler3 = new String[13];
            speler4 = new String[13];
            alleSpelers = speler1.length + speler2.length + speler3.length + speler4.length;
            deck = new String[alleSpelers];

            for (int i = 0; i < alleSpelers; i++) {
                if (teller1 == kleuren.length) {
                    teller1 = 0;
                    teller2++;
                }
                deck[i] = (kleuren[teller1] + " " + kaarten[teller2]);
                teller1++;
            }

            for (int i = 0; i < speler1.length; i++) {
                speler1[i] = deelKaarten();
                speler2[i] = deelKaarten();
                speler3[i] = deelKaarten();
                speler4[i] = deelKaarten();
            }
            repaint();
        }
    }

    private String deelKaarten() {
        int random = new Random().nextInt(deck.length);
        String usedCard = deck[random];

        String[] hulpLijst = new String[deck.length - 1];
        int hulpIndex = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpIndex] = deck[i];
                hulpIndex++;
            }
        }
        deck = hulpLijst;
        return usedCard;
    }
}
