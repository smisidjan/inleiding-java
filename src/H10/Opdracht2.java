package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    TextField tekstvak;
    boolean firstNumber;
    int maxInput;
    int minInput;
    int userInput;

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstListener());
        add(tekstvak);
        maxInput = 0;
        minInput = 0;
        firstNumber = true;
    }

    public void paint(Graphics g) {
        g.drawString("Max input: " + maxInput, 50,100);
        g.drawString("Min input: " + minInput, 50, 130);
    }

    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInputString = tekstvak.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstNumber) {
                firstNumber = false;
                maxInput = userInput;
                minInput = userInput;
                repaint();
            } else {
                if (userInput > maxInput){
                    maxInput = userInput;
                    repaint();
                } else{
                    if (userInput > minInput){
                        minInput = userInput;
                        repaint();
                    }
                }
            }
        }
    }
}
