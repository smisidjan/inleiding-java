package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdracht extends Applet {
    Button knopStartSpel;
    TextField tekstvak;
    boolean isGeklikt, eersteInvoer, invoer;
    int aantalSmileys, invoerSpeler;
    String tekstSpeler, tekstComputer, tekstGewonnen;
    private Image afbeelding;
    private URL pad;

    public void init() {
        setSize(400, 500);
        isGeklikt = false;
        aantalSmileys = 23;

        knopStartSpel = new Button("Start Spel");
        knopStartSpel.addActionListener(new knopStartSpelListener());
        add(knopStartSpel);

        tekstvak = new TextField(10);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);

        pad = Praktijkopdracht.class.getResource("/recources/");
        afbeelding = getImage(pad, "smiley.jpg");
    }

    public void paint(Graphics g) {
        int x = 100, y = 80;

        if (isGeklikt) {
            if (eersteInvoer) {
                g.drawString(" " + tekstComputer + " ", 70, 450);
                if (eersteInvoer) {
                    g.drawString("" + tekstSpeler, 100, 480);
                }
            }
        }

        if (isGeklikt) {
            for (int i = 0; i < aantalSmileys; i++) {
                g.drawImage(afbeelding, x, y, this);
                x += afbeelding.getWidth(this);
                if (x >= 300) {
                    x = 100;
                    y += afbeelding.getHeight(this);
                }
            }
        }

        if (aantalSmileys <= 0) {
            winnaarUitwerking();
            g.drawString("" + tekstGewonnen, 100, 420);
        }
    }

    class knopStartSpelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            isGeklikt = true;
            repaint();
        }
    }

    private class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (aantalSmileys >= 1) {
                spelersBeurt();
            }
            if (invoerSpeler >= 1 && invoerSpeler <= 3) {
                computerUitwerking();
            }
            repaint();
        }
    }

    private void computerUitwerking() {
        int computerAantal = 0;

        if (aantalSmileys >= 1) {
            switch (aantalSmileys) {
                case 1:
                case 2:
                case 9:
                case 15:
                case 17:
                case 18:
                case 22:
                    computerAantal = 1;
                    break;
                case 3:
                case 6:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 19:
                    computerAantal = 2;
                    break;
                case 4:
                case 7:
                case 11:
                case 13:
                case 20:
                    computerAantal = 3;
                    break;
                default:
                    computerAantal = (int) (Math.random() * 3) + 1;
                    break;
            }
            aantalSmileys = aantalSmileys - computerAantal;
            eersteInvoer = true;
        }
        tekstSpeler = "Er zijn " + aantalSmileys + " smiley over.";
        tekstComputer = "De computer heeft " + computerAantal + " smileys weggehaalt";
    }

    private void spelersBeurt() {
        invoerSpeler = Integer.parseInt(tekstvak.getText());
        if (invoerSpeler >= 1 && invoerSpeler <= 3) {
            aantalSmileys = aantalSmileys - invoerSpeler;
            tekstSpeler = "Er zijn " + aantalSmileys + " smileys over";
            eersteInvoer = true;
            invoer = false;
        } else {
            tekstSpeler = "Dit is geen geldige invoer.";
        }
    }

    private void winnaarUitwerking() {
        if (!invoer) {
            tekstGewonnen = "Je hebt verloren!";
        } else {
            tekstGewonnen = "Je hebt gewonnen!";
        }
    }
}

