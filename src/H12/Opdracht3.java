package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {
    Label label;
    TextField[] tekstvak = new TextField[5];
    Button knopOk;
    int [] onthouden;

    public void init() {
        onthouden = new int [5];
        
        label = new Label("Voer cijfer in: ");
        add(label);

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField( 5);
            add(tekstvak[i]);
        }

        knopOk = new Button("OK");
        knopOk.addActionListener(new knopOkListener());
        add(knopOk);
    }

    public void paint(Graphics g) {

    }

    class knopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for ( int i = 0; i < tekstvak.length; i++) {
                onthouden[i] = Integer.parseInt((tekstvak[i].getText()));
            }
            Arrays.sort(onthouden);

            for (int i = 0; i < tekstvak.length; i++) {
                tekstvak[i].setText(String.valueOf(onthouden[i]));
            }
        }
    }
}
