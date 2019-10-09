package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    boolean eersteNummer;
    int hoogstecijfer;
    int userInput;


    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener( new HoogstecijferListener());
        add(tekstvak);
        hoogstecijfer = 0;
        eersteNummer = true;

    }

    public void paint(Graphics g) {
        g.drawString("Hoogste cijfer: " + hoogstecijfer, 50, 100);
    }

    class HoogstecijferListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userInputString = tekstvak.getText();
            userInput = Integer.parseInt(userInputString);
            if (eersteNummer) {
                eersteNummer = false;
                hoogstecijfer = userInput;
                repaint();
            } else {
                if (userInput > hoogstecijfer){
                    hoogstecijfer = userInput;
                    repaint();
                }
            }
        }
    }
}
