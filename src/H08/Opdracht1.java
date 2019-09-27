package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht1 extends Applet {
    //GLOBAAL
    TextField tekstvak;
    Button knopOk;
    Button knopReset;
    String massage;

        public void init() {
            setSize(400,400);

            tekstvak = new TextField(20);
            add(tekstvak);

            knopOk = new Button("Ok");
            knopOk.addActionListener(new KnopOkListener());
            add(knopOk);

            knopReset = new Button("Reset");
            knopReset.addActionListener(new KnopResetListener());
            add(knopReset);

            massage = "Er is nog niets getypt";
        }

        public void paint(Graphics g) {
            g.drawString(massage, 20, 150);

        }

        class KnopOkListener implements ActionListener{

            public void actionPerformed(ActionEvent e) {
                massage = tekstvak.getText();
                repaint();

            }
        }

        class KnopResetListener implements ActionListener{

            public void actionPerformed(ActionEvent e) {
                tekstvak.setText(" ");

            }
        }
    }

