package HomeWork.p170717.solitare;

import java.awt.*;

//Class for drawing card suits
class CardPainter {

    public Graphics g;

    public CardPainter(Graphics g) {
        this.g = g;
    }

    public void drawHeart(int x, int y) {
        g.drawLine(x + 25, y + 30, x + 35, y + 20);
        g.drawLine(x + 35, y + 20, x + 45, y + 30);
        g.drawLine(x + 45, y + 30, x + 25, y + 60);
        g.drawLine(x + 25, y + 60, x + 5, y + 30);
        g.drawLine(x + 5, y + 30, x + 15, y + 20);
        g.drawLine(x + 15, y + 20, x + 25, y + 30);
    }

    public void drawSpade(int x, int y) {
        g.drawLine(x + 25, y + 20, x + 40, y + 50);
        g.drawLine(x + 40, y + 50, x + 10, y + 50);
        g.drawLine(x + 10, y + 50, x + 25, y + 20);
        g.drawLine(x + 22, y + 50, x + 20, y + 60);
        g.drawLine(x + 20, y + 60, x + 30, y + 60);
        g.drawLine(x + 30, y + 60, x + 28, y + 50);
    }

    public void drawDiamond(int x, int y) {
        g.drawLine(x + 25, y + 20, x + 40, y + 40);
        g.drawLine(x + 40, y + 40, x + 25, y + 60);
        g.drawLine(x + 25, y + 60, x + 10, y + 40);
        g.drawLine(x + 10, y + 40, x + 25, y + 20);
    }

    public void drawClub(int x, int y) {
        g.drawOval(x + 20, y + 25, 10, 10);
        g.drawOval(x + 25, y + 35, 10, 10);
        g.drawOval(x + 15, y + 35, 10, 10);
        g.drawLine(x + 23, y + 45, x + 20, y + 55);
        g.drawLine(x + 20, y + 55, x + 30, y + 55);
        g.drawLine(x + 30, y + 55, x + 27, y + 45);
    }

    public void drawFaceDown(int x, int y) {
        g.setColor(Color.yellow);
        g.drawLine(x + 15, y + 5, x + 15, y + 65);
        g.drawLine(x + 35, y + 5, x + 35, y + 65);
        g.drawLine(x + 5, y + 20, x + 45, y + 20);
        g.drawLine(x + 5, y + 35, x + 45, y + 35);
        g.drawLine(x + 5, y + 50, x + 45, y + 50);
    }

    public void drawCardName(int x, int y, String name) {
        g.drawString(name, x + 3, y + 15);
    }

    public void drawEmptyCard(int color, int x, int y) {
        g.clearRect(x, y, Constants.CARD_WIDTH, Constants.CARD_HEIGHT);
        setColor(color);
        g.drawRect(x, y, Constants.CARD_WIDTH, Constants.CARD_HEIGHT);
    }

    public void setColor(int color) {
        switch (color) {
            case Constants.RED:
                g.setColor(Color.red);
                break;
            case Constants.BLACK:
                g.setColor(Color.black);
                break;
            case Constants.BLUE:
                g.setColor(Color.blue);
        }
    }

}
