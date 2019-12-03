package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    Label labelNamen, labelNummers;
    TextField tekstvakNamen, tekstvakNummers;
    Button knopOk;
    String[] namen, nummers;
    int index = 0;


    public void init() {
        setSize(1000, 300);
        labelNamen = new Label("Vul 10 namen in: ");
        add(labelNamen);

        tekstvakNamen = new TextField(15);
        add(tekstvakNamen);

        labelNummers = new Label("Vul 10 nummers in: ");
        add(labelNummers);

        tekstvakNummers = new TextField(15);
        add(tekstvakNummers);

        knopOk = new Button("OK");
        knopOk.addActionListener(new KnopOkListener());
        add(knopOk);

        namen = new String[10];
        nummers = new String[10];
    }

    public void paint(Graphics g) {
        int x =20;


            for (int i = 0; i < namen.length; i++) {
                if (index > 9 ){
                 int y= 120;
                 g.drawString("De 10 namen en nummers: ", 20, 80);
                 g.drawString(" " + namen[i], x, y);
                 y += 20;
                 g.drawString(" " + nummers[i],x, y );
                  x += 100;
            }
        }
    }

    class KnopOkListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                namen[index] = tekstvakNamen.getText();
                nummers[index] = tekstvakNummers.getText();
                index++;

                if (index > 9){
                    repaint();
                }



        }
    }
}

