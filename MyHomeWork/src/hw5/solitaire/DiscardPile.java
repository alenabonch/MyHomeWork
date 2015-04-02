package hw5.solitaire;

class DiscardPile extends SelectPile {

	DiscardPile(final int x, final int y) {
		super(x, y);
	}

	public void addCard(final Card aCard) {
		if (!aCard.isFaceUp()) {
			aCard.flip();
		}
		super.addCard(aCard);
	}


}