package hw5.solitaire;

public class SelectPile extends CardPile {

	SelectPile(int x, int y) {
		super(x, y);		
	}
	
	public void select(final int tx, final int ty) {
		if (isEmpty()) {
			return;
		}
		// else see if any suit pile can take card
		Card topCard = pop();
		for (int i = 0; i < 4; i++) {
			if (Solitaire.suitPile[i].canTake(topCard)) {
				Solitaire.suitPile[i].addCard(topCard);
				return;
			}
		}
		// else see if any other table pile can take card
		for (int i = 0; i < 7; i++) {
			if (Solitaire.tableau[i].canTake(topCard)) {
				Solitaire.tableau[i].addCard(topCard);
				return;
			}
		}
		// nobody can use it, put it back on our list
		addCard(topCard);
	}

}
