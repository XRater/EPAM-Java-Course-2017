package ClassWork.p170717.solitare;

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

    public void push(Card aCard) {
        aCard.link = firstCard;
        firstCard = aCard;
    }

    public Card pop() {
        Card result = null;
        if (firstCard != null) {
            result = firstCard;
            firstCard = firstCard.link;
        }
        return result;
    }

    public boolean includes(int tx, int ty) {
        return x <= tx && tx <= x + Card.WIDTH &&
                y <= ty && ty <= y + Card.HEIGHT;
    }

    public void select(int tx, int ty) {
        // do nothing
    }

    public void display(Graphics g) {
        g.setColor(Color.black);
        if (firstCard == null) {
            g.drawRect(x, y, Card.WIDTH, Card.HEIGHT);
        } else {
            firstCard.draw(g, x, y);
        }
    }

    public boolean canTake(Card aCard) {
        return false;
    }
}
