package HomeWork.p170717.solitare;

import java.awt.*;

class CardPile {

    // coordinates of the card pile
    protected int x;
    protected int y;
    private Card firstCard;

    CardPile(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
        firstCard = Card.EMPTY_CARD;
    }

    public Card top() {
        return firstCard;
    }

    public boolean isEmpty() {
        return firstCard.isEmpty();
    }

    // Basic list interface (mostly same for all piles)
    public void join(Card aCard) {
        aCard.setNext(firstCard);
        firstCard.setPrev(aCard);
        firstCard = aCard;
        while (!firstCard.isFirst()) {
            firstCard = firstCard.getPrev();
        }
    }

    public Card pop() {
        return split(firstCard);
    }

    public Card split(Card card) {
        // change links
        firstCard = card.getNext();
        firstCard.setPrev(Card.EMPTY_CARD);
        card.setNext(Card.EMPTY_CARD);
        return card;
    }

    // Click processing
    public void simpleClick(Card card) {
        if (CardHolder.isHoldingCard()) {
            if (canTake(CardHolder.getCard())) {
                CardHolder.move(this);
            } else {
                CardHolder.unhold();
            }
        } else {
            pick(card);
        }
    }

    public void doubleClick(Card card) {
        CardHolder.unhold();

        for (int i = 0; i < 4; i++) {
            if (Solitare.suitPile[i].canTake(card)) {
                Solitare.suitPile[i].join(pop());
                return;
            }
        }
    }

    // Pick and drop related methods
    public void pick(Card card) {
        if (card.isEmpty()) {
            CardHolder.unhold();
        } else {
            CardHolder.hold(this, card);
        }
    }

    public boolean canTake(Card aCard) {
        return false;
    }

    // Find card by position
    public boolean inside(int xCoord, int yCoord) {
        return xCoord >= x && xCoord <= x + Constants.CARD_WIDTH &&
                yCoord >= y && yCoord <= y + Constants.CARD_HEIGHT;
    }

    public Card getCard(int xCoord, int yCoord) {
        if (inside(x, y)) {
            return top();
        }
        return Card.EMPTY_CARD;
    }

    // Visual
    public void display(Graphics g) {
        CardPainter painter = new CardPainter(g);
        if (firstCard == Card.EMPTY_CARD) {
            painter.drawEmptyCard(Constants.BLACK, x, y);
        } else {
            firstCard.draw(g, x, y);
        }
    }
}
