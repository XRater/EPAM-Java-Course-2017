package HomeWork.p170717.solitare;

class DiscardPile extends CardPile {

    DiscardPile(int x, int y) {
        super(x, y);
    }

    @Override
    public void join(Card aCard) {
        if (!aCard.isFaceUp()) {
            aCard.open();
        }
        super.join(aCard);
    }

    @Override
    public void select(Card card) {
        if (empty())
            return;
        Card topCard = pop();
        for (int i = 0; i < 4; i++)
            if (Solitare.suitPile[i].canTake(topCard)) {
                Solitare.suitPile[i].join(topCard);
                return;
            }
        for (int i = 0; i < 7; i++)
            if (Solitare.tableau[i].canTake(topCard)) {
                Solitare.tableau[i].join(topCard);
                return;
            }
        // nobody can use it, put it back on our list
        join(topCard);
    }
}
