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

    public boolean empty() {
        return firstCard == null;
    }

    public void join(Card aCard) {
        aCard.next = firstCard;
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
        firstCard = card.next;
        if (firstCard != null) {
            firstCard.prev = null;
        }
        card.next = null;
        return card;
    }

    public void select(Card card) {
        if (CardHolder.isHoldingCard()) {
            if (canTake(CardHolder.getCard())) {
                CardHolder.move(this);
            } else {
                CardHolder.unhold();
            }
        } else {
            CardHolder.hold(this, card);
        }
    }

    public void display(Graphics g) {
        CardPainter painter = new CardPainter(g);
        if (firstCard == null) {
            painter.drawEmptyCard(Constants.BLACK, x, y);
        } else {
            firstCard.draw(g, x, y);
        }
    }

    public boolean canTake(Card aCard) {
        return false;
    }

    public Card getCard(int xCoord, int yCoord) {
        if (x <= xCoord && xCoord <= x + Constants.CARD_WIDTH &&
                y <= yCoord && yCoord <= y + Constants.CARD_HEIGHT) {
            return top();
        }
        return null;
    }

    public boolean inside(int xCoord, int yCoord) {
        return xCoord >= x && xCoord <= x + Constants.CARD_WIDTH &&
                yCoord >= y && yCoord <= y + Constants.CARD_HEIGHT;
    }

    public void doubleClick(Card card) {
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
}
