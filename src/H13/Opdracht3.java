package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet implements ActionListener {
    Button knopLinks;
    Button knopRechts;
    boolean rodeMuur = false;
    boolean grijzeMuur = false;

    public void init() {
        setSize(600,600);
        knopLinks = new Button("BakstenenMuur");
        knopLinks.addActionListener( this);
        add(knopLinks);

        knopRechts = new Button("Betonblokkenmuur");
        knopRechts.addActionListener(this);
        add(knopRechts);
    }

    public void paint(Graphics g) {

        if (rodeMuur){
            int x = 20;
            int y = 70;
            int width = 40;
            int height = 20;
            tekenRodeMuur(g, x, y, width, height);
        } else if (grijzeMuur){
            int x = 20;
            int y = 70;
            int width = 55;
            int height = 25;
            tekenBetonblokkenMuur(g, x, y, width, height);
        }
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == knopLinks){
            rodeMuur = true;
            repaint();
        }
        else if (evt.getSource() == knopRechts){
            rodeMuur = false;
            grijzeMuur = true;
            repaint();
        }
    }


    void tekenRodeMuur (Graphics g, int x,  int y, int width, int height){
        for (int i = 0; i < 10; i++) {
            x = 20;
            for (int j = 0; j < 10; j++) {
                g.setColor(Color.red);
                g.fillRect(x, y, width, height);
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                x += width;
            }
            y += height;
        }
    }

    void tekenBetonblokkenMuur ( Graphics g, int x, int y, int width, int height){
        for (int i = 0; i < 10; i++) {
            x = 20;
            for (int j = 0; j < 10; j++) {
                g.setColor(Color.gray);
                g.fillRect(x, y, width, height);
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                x += width;
            }
            y += height;
        }
    }
}
