package HomeWork.p170717.solitare;

class SuitPile extends CardPile {

    SuitPile(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canTake(Card card) {
        if (!card.isFirst()) {
            return false;
        }
        if (isEmpty()) {
            return card.getRank() == 0;
        }
        Card topCard = top();
        return (card.getSuit() == topCard.getSuit()) &&
                (card.getRank() == 1 + topCard.getRank());
    }
}
