package hw5.solitaire;

class SuitPile extends CardPile {

	SuitPile(final int x, final int y) {
		super(x, y);
	}

	public boolean canTake(final Card aCard) {
		if (isEmpty()) {
			return aCard.isAce();
		}
		Card topCard = top();
		return (aCard.getSuit() == topCard.getSuit())
				&& (aCard.getRank() == 1 + topCard.getRank());
	}
}