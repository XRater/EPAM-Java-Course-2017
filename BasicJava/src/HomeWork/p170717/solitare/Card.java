package HomeWork.p170717.solitare;

import java.awt.*;

class Card {

    public static final EmptyCard EMPTY_CARD = new EmptyCard();

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

    private boolean holded;
    private boolean faceup;
    private Card next = EMPTY_CARD;
    private Card prev = EMPTY_CARD;

    // constructor
    Card(int suitValue, int rankValue) {
        suit = suitValue;
        rank = rankValue;
        faceup = false;
        holded = false;
    }

    // access attributes of card
    public Card getNext() {
        return next;
    }

    public Card getPrev() {
        return prev;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFaceUp() {
        return faceup;
    }

    public boolean isFront() {
        return prev == EMPTY_CARD;
    }

    public boolean isBack() {
        return next == EMPTY_CARD;
    }

    public int getColor() {
        return getSuit() == heart || getSuit() == diamond ?
                Constants.RED : Constants.BLACK;
    }

    //set attributes of card
    public void setNext(Card card) {
        next = card;
    }

    public void setPrev(Card card) {
        prev = card;
    }

    // mutations
    public void open() {
        faceup = true;
    }

    public void close() {
        faceup = false;
    }

    public void hold() {
        holded = true;
    }

    public void unhold() {
        holded = false;
    }

    // drawing
    public void draw(Graphics g, int x, int y) {
        CardPainter painter = new CardPainter(g);

        // clear rectangle, draw border
        painter.drawEmptyCard(holded ? Constants.BLUE : Constants.BLACK, x, y);

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
                    painter.drawDiamond(x, y);
                    break;
                case club:
                    painter.drawClub(x, y);
                    break;
            }
        } else // face down
        {
            painter.drawFaceDown(x, y);
        }
    }


    //empty card class
    private static class EmptyCard extends Card {

        EmptyCard() {
            super(0, 0);
        }

        @Override
        public Card getNext() {
            return this;
        }

        @Override
        public Card getPrev() {
            return this;
        }

        @Override
        public void setNext(Card card) {
        }

        @Override
        public void setPrev(Card card) {
        }

        @Override
        public int getRank() {
            return -1;
        }

        @Override
        public int getSuit() {
            return -1;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public boolean isFaceUp() {
            return false;
        }

        @Override
        public boolean isFront() {
            return false;
        }

        @Override
        public boolean isBack() {
            return false;
        }

        @Override
        public int getColor() {
            return -1;
        }

        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public void hold() {
        }

        @Override
        public void unhold() {
        }

        @Override
        public void draw(Graphics g, int x, int y) {
        }
    }
}
