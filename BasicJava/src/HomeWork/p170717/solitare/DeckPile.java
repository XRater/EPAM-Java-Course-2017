package HomeWork.p170717.solitare;

class DeckPile extends CardPile {

    DeckPile(int x, int y) {
        // first initialize parent
        super(x, y);
        // then create the new deck
        // first put them into a local pile
        CardPile pileOne = new CardPile(0, 0);
        CardPile pileTwo = new CardPile(0, 0);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 12; j++) {
                pileOne.join(new Card(i, j));
                count++;
            }
        }
        // then pull them out randomly
        for (; count > 0; count--) {
            int limit = ((int) (Math.random() * 1000)) % count;
            // move down to a random location
            for (int i = 0; i < limit; i++) {
                pileTwo.join(pileOne.pop());
            }
            // then add the card found there
            join(pileOne.pop());
            // then put the decks back together
            while (!pileTwo.empty()) {
                pileOne.join(pileTwo.pop());
            }
        }
    }

    @Override
    public void select(Card card) {
        if (empty()) {
            while (!Solitare.discardPile.empty()) {
                Card cardToRemove = Solitare.discardPile.pop();
                cardToRemove.close();
                join(cardToRemove);
            }
            return;
        }
        if (CardHolder.isHoldingCard()) {
            CardHolder.unhold();
            return;
        }
        Solitare.discardPile.join(pop());
    }

    @Override
    public void doubleClick(Card card) {}
}
