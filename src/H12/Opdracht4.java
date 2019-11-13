package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet implements ActionListener {
    TextField tekstvak;
    Button knopOk;
    boolean isGevonden;
    boolean isGeklikt;
    int index;
    int [ ] getallen = { 4, 6, 12, 33, 55, 90};

    public void init() {
        tekstvak = new TextField(5);
        add(tekstvak);

        knopOk = new Button("OK");
        knopOk.addActionListener(this);
        add(knopOk);

        isGevonden = false;
    }

    public void paint(Graphics g) {
        if (isGeklikt) {
            if (isGevonden) {
                g.drawString(" De waarde is gevonden op index: " + index, 50, 80);
            } else {
                g.drawString(" De waarde is niet gevonden ", 50, 80);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        isGevonden = false;
        int input = Integer.parseInt(tekstvak.getText());
        isGeklikt = true;

        for (int i = 0; i < getallen.length; i++) {
            if (getallen[i] == input) {
                isGevonden = true;
                index = i;
            }
        }
        repaint();
    }
}

