package ClassWork.p170717.solitare;

import java.awt.*;

class Card {
    // data fields for colors and suits
    final static int WIDTH = 50;
    final static int HEIGHT = 70;

    final static int red = 0;
    final static int black = 1;

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
    Card link = null;

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
        return getSuit() == heart || getSuit() == diamond ? red : black;
    }

    // mutations
    public void flip() {
        faceup = !faceup;
    }

    // drawing
    public void draw(Graphics g, int x, int y) {
        CardPainter painter = new CardPainter(g);

        // clear rectangle, draw border
        painter.drawEmptyCard(x, y);

        // draw body of card
        if (isFaceUp()) {
            painter.setColor(getColor());
            painter.drawName(x, y, CARD_NAMES[getRank()]);

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

    //Class for drawing card suits
    private static class CardPainter {

        private final Graphics g;

        public CardPainter(Graphics g) {
            this.g = g;
        }

        private void drawHeart(int x, int y) {
            g.drawLine(x + 25, y + 30, x + 35, y + 20);
            g.drawLine(x + 35, y + 20, x + 45, y + 30);
            g.drawLine(x + 45, y + 30, x + 25, y + 60);
            g.drawLine(x + 25, y + 60, x + 5, y + 30);
            g.drawLine(x + 5, y + 30, x + 15, y + 20);
            g.drawLine(x + 15, y + 20, x + 25, y + 30);
        }

        private void drawSpade(int x, int y) {
            g.drawLine(x + 25, y + 20, x + 40, y + 50);
            g.drawLine(x + 40, y + 50, x + 10, y + 50);
            g.drawLine(x + 10, y + 50, x + 25, y + 20);
            g.drawLine(x + 23, y + 45, x + 20, y + 60);
            g.drawLine(x + 20, y + 60, x + 30, y + 60);
            g.drawLine(x + 30, y + 60, x + 27, y + 45);
        }

        private void drawDimond(int x, int y) {
            g.drawLine(x + 25, y + 20, x + 40, y + 40);
            g.drawLine(x + 40, y + 40, x + 25, y + 60);
            g.drawLine(x + 25, y + 60, x + 10, y + 40);
            g.drawLine(x + 10, y + 40, x + 25, y + 20);
        }

        private void drawClub(int x, int y) {
            g.drawOval(x + 20, y + 25, 10, 10);
            g.drawOval(x + 25, y + 35, 10, 10);
            g.drawOval(x + 15, y + 35, 10, 10);
            g.drawLine(x + 23, y + 45, x + 20, y + 55);
            g.drawLine(x + 20, y + 55, x + 30, y + 55);
            g.drawLine(x + 30, y + 55, x + 27, y + 45);
        }

        private void drawFaceDown(int x, int y) {
            g.setColor(Color.yellow);
            g.drawLine(x + 15, y + 5, x + 15, y + 65);
            g.drawLine(x + 35, y + 5, x + 35, y + 65);
            g.drawLine(x + 5, y + 20, x + 45, y + 20);
            g.drawLine(x + 5, y + 35, x + 45, y + 35);
            g.drawLine(x + 5, y + 50, x + 45, y + 50);
        }

        private void drawName(int x, int y, String name) {
            g.drawString(name, x + 3, y + 15);
        }

        private void drawEmptyCard(int x, int y) {
            g.clearRect(x, y, WIDTH, HEIGHT);
            g.setColor(Color.black);
            g.drawRect(x, y, WIDTH, HEIGHT);
        }

        public void setColor(int color) {
            g.setColor(color == red ? Color.red : Color.black);
        }
    }

}
