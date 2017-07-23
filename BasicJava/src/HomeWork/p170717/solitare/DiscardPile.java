package HomeWork.p170717.solitare;

class DiscardPile extends CardPile {

    DiscardPile(int x, int y) {
        super(x, y);
    }

    /*
         We cant put a card back to the discard pile,
         thus we need this override
    */
    @Override
    public void simpleClick(Card card) {
        if (CardHolder.isHoldingCard()) {
            CardHolder.unhold();
        } else {
            pick(card);
        }
    }
}
