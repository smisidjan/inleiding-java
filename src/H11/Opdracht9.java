package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {
    public void init() {
        setSize(1000, 500);
    }

    public void paint(Graphics g) {
        int y = 50;
        int hoogte = 50;
        int breedte = 50;

        for (int rij = 0; rij < 8; rij++) {
            int x = 50;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (rij == 0 || rij == 2 || rij == 4 || rij == 6) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.BLACK);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(Color.WHITE);
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x += breedte;
                }
                if (rij == 1 || rij == 3 || rij == 5 || rij == 7) {
                    if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                        g.setColor(Color.BLACK);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(Color.WHITE);
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x += breedte;
                }
            }
            y += hoogte;
        }
    }
}
