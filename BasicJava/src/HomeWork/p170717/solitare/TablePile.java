package HomeWork.p170717.solitare;

import java.awt.*;

class TablePile extends CardPile {

    TablePile(int x, int y, int c) {
        // initialize the parent class
        super(x, y);
        // then initialize our pile of cards
        for (int i = 0; i < c; i++) {
            join(Solitare.deckPile.pop());
        }
        // open topmost card face up
        top().open();
    }

    @Override
    public boolean canTake(Card aCard) {
        if (empty()) {
            return aCard.getRank() == 12;
        }
        Card topCard = top();
        return (aCard.getColor() != topCard.getColor()) &&
                (aCard.getRank() == topCard.getRank() - 1);
    }

//    @Override
//    public boolean includes(int tx, int ty) {
//        // don't test bottom of card
//        return x <= tx && tx <= x + Constants.CARD_WIDTH &&
//                y <= ty;
//    }

    @Override
    public void select(Card card) {
        if (empty()) {
            return;
        }

        Card topCard = top();
        // else see if any getSuit pile can take card
        for (int i = 0; i < 4; i++) {
            if (Solitare.suitPile[i].canTake(topCard)) {
                Solitare.suitPile[i].join(split(topCard));
                if (top() != null)
                    top().open();
                return;
            }
        }

        // else see if any other table pile can take card
        for (int i = 0; i < 7; i++) {
            if (Solitare.tableau[i].canTake(topCard)) {
                Solitare.tableau[i].join(split(topCard));
                if (top() != null)
                    top().open();
                return;
            }
        }
    }

    private int stackDisplay(Graphics g, Card aCard) {
        if (aCard == null) {
            return y;
        }
        int localy = stackDisplay(g, aCard.next);
        aCard.draw(g, x, localy);
        return localy + 35;
    }

    @Override
    public void display(Graphics g) {
        stackDisplay(g, top());
    }

}
