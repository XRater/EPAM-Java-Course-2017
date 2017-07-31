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
        if (isEmpty()) {
            return aCard.getRank() == 12;
        }
        Card topCard = top();
        return (aCard.getColor() != topCard.getColor()) &&
                (aCard.getRank() == topCard.getRank() - 1);
    }

    @Override
    public Card getCard(int xCoord, int yCoord) {
        Card card = top();

        if (xCoord < x || xCoord > x + Constants.CARD_WIDTH || yCoord < y || card.isEmpty()) {
            return Card.EMPTY_CARD;
        }

        // move down to the last card
        while (!card.isBack()) {
            card = card.getNext();
        }

        //move up while we are out of card
        int cardY = y;
        while (yCoord > cardY + 35 && !card.isFront()) {
            card = card.getPrev();
            cardY += 35;
        }

        if (!card.isFaceUp()) {
            return Card.EMPTY_CARD;
        }
        if (yCoord > cardY + Constants.CARD_HEIGHT) {
            return Card.EMPTY_CARD;
        }

        return card;
    }

    // We need this override to open top card
    @Override
    public Card split(Card card) {
        Card resultCard = super.split(card);
        top().open();
        return resultCard;
    }

    // By this implementation we support drop click in any place of column
    @Override
    public boolean inside(int xCoord, int yCoord) {
        int size = 0;
        return xCoord >= x && xCoord <= x + Constants.CARD_WIDTH && yCoord >= y;
    }

    private int stackDisplay(Graphics g, Card aCard) {
        if (aCard == Card.EMPTY_CARD) {
            return y;
        }
        int localy = stackDisplay(g, aCard.getNext());
        aCard.draw(g, x, localy);
        return localy + 35;
    }

    @Override
    public void display(Graphics g) {
        stackDisplay(g, top());
    }

}
