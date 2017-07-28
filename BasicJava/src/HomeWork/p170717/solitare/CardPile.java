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
        firstCard = null;
    }

    public Card top() {
        return firstCard;
    }

    public boolean isEmpty() {
        return firstCard == null;
    }

    // Basic list interface (mostly same for all piles)
    public void join(Card aCard) {
        aCard.setNext(firstCard);
        if (firstCard != null) {
            firstCard.prev = aCard;
        }
        firstCard = aCard;
        while (firstCard.prev != null) {
            firstCard = firstCard.prev;
        }
    }

    public Card pop() {
        return split(firstCard);
    }

    public Card split(Card card) {
        if (card == null) {
            return null;
        }
        // change links
        firstCard = card.getNext();
        if (firstCard != null) {
            firstCard.prev = null;
        }
        card.setNext(null);
        return card;
    }

    // Click proccessing
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
        if (top() != card) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (Solitare.suitPile[i].canTake(card)) {
                Solitare.suitPile[i].join(pop());
                return;
            }
        }
    }

    // Pick and drop related methods
    public void pick(Card card) {
        if (card != null) {
            CardHolder.hold(this, card);
        } else {
            CardHolder.unhold();
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
        return null;
    }

    // Visual
    public void display(Graphics g) {
        CardPainter painter = new CardPainter(g);
        if (firstCard == null) {
            painter.drawEmptyCard(Constants.BLACK, x, y);
        } else {
            firstCard.draw(g, x, y);
        }
    }
}
