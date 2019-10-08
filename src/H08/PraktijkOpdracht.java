package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    Double eindbedrag;
    TextField tekstvak1;
    TextField tekstvak2;
    Button knopKeer;
    Button knopGedeeld;
    Button knopPlus;
    Button knopMin;

    public void init() {

        tekstvak1 = new TextField(15);
        add(tekstvak1);

        tekstvak2 = new TextField(15);
        add(tekstvak2);

        knopKeer = new Button("*");
        knopKeer.addActionListener(new KnopKeerListener());
        add(knopKeer);

        knopGedeeld = new Button("/");
        knopGedeeld.addActionListener(new KnopGedeeldListener());
        add(knopGedeeld);

        knopPlus = new Button("+");
        knopPlus.addActionListener(new KnopPlusListener());
        add(knopPlus);

        knopMin = new Button("-");
        knopMin.addActionListener(new KnopMinListener());
        add(knopMin);

    }


    public void paint(Graphics g) {

    }

            class KnopKeerListener implements ActionListener{
                 public void actionPerformed(ActionEvent e) {
                     eindbedrag = Double.parseDouble(tekstvak1.getText()) * Double.parseDouble(tekstvak2.getText());
                     tekstvak1.setText(" " + eindbedrag);
                     tekstvak2.setText(" ");
                     repaint();

                }
             }

            class KnopGedeeldListener implements ActionListener{
                 public void actionPerformed(ActionEvent e) {
                     eindbedrag = Double.parseDouble(tekstvak1.getText()) / Double.parseDouble(tekstvak2.getText());
                     tekstvak1.setText(" " + eindbedrag);
                     tekstvak2.setText(" ");
                     repaint();

                 }
            }

             class KnopPlusListener implements ActionListener{
                public void actionPerformed(ActionEvent e) {
                    eindbedrag = Double.parseDouble(tekstvak1.getText()) + Double.parseDouble(tekstvak2.getText());
                    tekstvak1.setText(" " + eindbedrag);
                    tekstvak2.setText(" ");
                    repaint();

                 }
             }

             class KnopMinListener implements ActionListener{
                   public void actionPerformed(ActionEvent e) {
                       eindbedrag = Double.parseDouble(tekstvak1.getText()) - Double.parseDouble(tekstvak2.getText());
                       tekstvak1.setText(" " + eindbedrag);
                       tekstvak2.setText(" ");
                       repaint();

                }
            }
}
