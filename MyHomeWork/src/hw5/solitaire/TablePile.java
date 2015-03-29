package hw5.solitaire;

import java.awt.Graphics;

class TablePile extends SelectPile {
	
	final int SHIFT = 35;

	TablePile(final int x, final int y, final int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			addCard(Solitaire.deckPile.pop());
		}
		// flip topmost card face up
		top().flip();
	}

	public boolean canTake(final Card aCard) {
		if (empty()) {
			return aCard.isKing();
		}
		Card topCard = top();
		return (aCard.color() != topCard.color())
				&& (aCard.getRank() == topCard.getRank() - 1);
	}

	public void display(final Graphics g) {
		stackDisplay(g, top());
	}

	public boolean includes(final int tx, final int ty, CardPile cardPile) {
		int count = cardPile.countCards(cardPile);
		// don't test bottom of card
		return tx >= x && tx <= x + Card.WIDTH 
				&& ty >= y + SHIFT*(count-1)
				&& ty <= y + SHIFT*(count-1) + Card.HEIGHT;
	}

    public void select(final int tx, final int ty) {
		// if face down, then flip
		Card topCard = top();
		if (!topCard.isFaceUp()) {
			topCard.flip();
			return;
		}
		super.select(tx, ty);
	}

	private int stackDisplay(final Graphics g, final Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy);
		return localy + SHIFT;
	}

}