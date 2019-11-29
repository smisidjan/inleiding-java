package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet implements ActionListener {
    Label label;
    TextField textvak;
    int[] waardes = new int[5];
    int input;
    String tekst;

    public void init() {
        for (int i = 0; i < waardes.length; i++) {
            waardes[i] = (int) (Math.random() * 6 + 1);
        }

        label = new Label("Voer een getal in: ");
        add(label);

        textvak = new TextField(10);
        textvak.addActionListener(this);
        add(textvak);
    }

    public void paint(Graphics g) {
        int x = 30;

        for (int i = 0; i < waardes.length; i++) {
            g.drawString(" " + waardes[i], x, 70);
            x += 20;
        }
        g.drawString(" " + tekst, 100, 100);
    }

    public void actionPerformed(ActionEvent e) {
        input = Integer.parseInt(textvak.getText());
        int aantal = 0;

        for (int i = 0; i < waardes.length; i++) {
            if (waardes[i] == input) {
                aantal++;
            }
            repaint();

        }
        if (aantal > 1){
            tekst = input + "  is " + aantal + "  keer gevonden";
        }else {
            tekst = input + "  is niet gevonden.";
        }
    }
}
