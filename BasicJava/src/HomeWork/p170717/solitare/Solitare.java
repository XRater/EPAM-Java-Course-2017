package HomeWork.p170717.solitare;

/*
Simple Solitare Card Game in Java
Written by Tim Budd, Oregon State University, 1996
*/

import java.applet.Applet;
import java.awt.*;

public class Solitare extends Applet {
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static TablePile[] tableau;
    static SuitPile[] suitPile;
    static CardPile[] allPiles;

    @Override
    public void init() {
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
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++) {
            allPiles[i].display(g);
        }
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        Card card = null;
        for (int i = 0; i < 13; i++) {
            card = allPiles[i].getCard(x, y);
            if (card != null) {
                allPiles[i].select(card);
                repaint();
                return true;
            }
        }
        return true;
    }
}