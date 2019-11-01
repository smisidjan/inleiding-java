package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    double cijfer;

    public void init() {
        setSize(500, 500);

        label = new Label("Voer je cijfer in.");
        add(label);

        tekstvak = new TextField(10);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);



    }

    public void paint(Graphics g) {

        g.drawString(tekst , 50, 100);

    }

    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);

            switch ( (int) cijfer) {
                case 1:
                    tekst = " Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9 :
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                default:
                    tekst = "U heeft een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }

}

