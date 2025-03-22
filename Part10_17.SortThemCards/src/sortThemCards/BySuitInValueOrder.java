package sortThemCards;

import java.util.Comparator;

/**
 * Comparator que ordena as cartas primeiro pelo naipe e depois pelo valor.
 */
public class BySuitInValueOrder implements Comparator<Card> {
	@Override
	public int compare(Card c1, Card c2) {
		// Compara primeiro pelo naipe
		int suitComparison = Integer.compare(c1.getSuit().ordinal(), c2.getSuit().ordinal());

		// Se os naipes forem iguais, compara pelo valor
		return (suitComparison != 0) ? suitComparison : Integer.compare(c1.getValue(), c2.getValue());
	}
}
