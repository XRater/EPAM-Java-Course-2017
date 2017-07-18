package HomeWork.p170717.solitare;

import java.awt.*;

class Card {
    // data fields for suits
    final static int heart = 0;
    final static int spade = 1;
    final static int diamond = 2;
    final static int club = 3;

    public static final String[] CARD_NAMES = new String[]{"A", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "J", "Q", "K"};

    // data fields
    private int rank;
    private int suit;

    private boolean faceup;
    Card next = null;
    Card prev = null;

    // constructor
    Card(int suitValue, int rankValue) {
        suit = suitValue;
        rank = rankValue;
        faceup = false;
    }

    // access attributes of card
    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public boolean isFaceUp() {
        return faceup;
    }

    public int getColor() {
        return getSuit() == heart || getSuit() == diamond ?
                Constants.RED : Constants.BLACK;
    }

    // mutations
    public void open() {
        faceup = true;
    }

    // drawing
    public void draw(Graphics g, int x, int y) {
        CardPainter painter = new CardPainter(g);

        // clear rectangle, draw border
        painter.drawEmptyCard(x, y);

        // draw body of card
        if (isFaceUp()) {
            painter.setColor(getColor());
            painter.drawCardName(x, y, CARD_NAMES[getRank()]);

            switch (getSuit()) {
                case heart:
                    painter.drawHeart(x, y);
                    break;
                case spade:
                    painter.drawSpade(x, y);
                    break;
                case diamond:
                    painter.drawDimond(x, y);
                    break;
                case club:
                    painter.drawClub(x, y);
                    break;
            }
        } else // face down
            painter.drawFaceDown(x, y);
    }
}
