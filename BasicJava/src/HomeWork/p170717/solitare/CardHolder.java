package HomeWork.p170717.solitare;

class CardHolder {

    static private Card card = Card.EMPTY_CARD;
    static private CardPile pile = null;

    //access attributes
    public static boolean isHoldingCard() {
        return !card.isEmpty();
    }

    public static Card getCard() {
        return card;
    }

    public static void move(CardPile destPile) {
        destPile.join(pile.split(card));
        unhold();
    }

    public static void hold(CardPile cardPile, Card cardToHold) {
        pile = cardPile;
        card = cardToHold;
        card.hold();
    }

    public static void unhold() {
        card.unhold();
        card = Card.EMPTY_CARD;
        pile = null;
    }
}
