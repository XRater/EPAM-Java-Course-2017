package HomeWork.p170717.solitare;

/*
Simple Solitare Card Game in Java
Written by Tim Budd, Oregon State University, 1996
*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Solitare extends Applet {
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static TablePile[] tableau;
    static SuitPile[] suitPile;
    static CardPile[] allPiles;

    @Override
    public void init() {
        this.setSize(new Dimension(400, 500));

        // first allocate the arrays
        allPiles = new CardPile[13];
        suitPile = new SuitPile[4];
        tableau = new TablePile[7];
        // then fill them in
        allPiles[0] = deckPile = new DeckPile(335, 5);
        allPiles[1] = discardPile = new DiscardPile(268, 5);
        for (int i = 0; i < 4; i++) {
            allPiles[2 + i] = suitPile[i] =
                    new SuitPile(15 + 60 * i, 5);
        }
        for (int i = 0; i < 7; i++) {
            allPiles[6 + i] = tableau[i] =
                    new TablePile(5 + 55 * i, 80, i + 1);
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {
//                    System.out.println("double");
                    doubleClick(e.getX(), e.getY());
                } else if (e.getClickCount() == 1) {
//                    System.out.println("once");
                    oneClick(e.getX(), e.getY());
                }
            }
        });

    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++) {
            allPiles[i].display(g);
        }
    }

    public boolean oneClick(int x, int y) {
        for (int i = 0; i < 13; i++) {
            if (allPiles[i].inside(x, y)) {
                allPiles[i].select(allPiles[i].getCard(x, y));
                repaint();
                return true;
            }
        }
        CardHolder.unhold();
        repaint();
        return true;
    }

    public boolean doubleClick(int x, int y) {
        System.out.println("hi");
        if (!CardHolder.isHoldingCard()) {
//            CardHolder.unhold();
//            repaint();
            return true;
        }
        CardHolder.unhold();
        for (int i = 0; i < 13; i++) {
            if (allPiles[i].inside(x, y)) {
                allPiles[i].doubleClick(allPiles[i].getCard(x, y));
                repaint();
                return true;
            }
        }
        return true;
    }
}