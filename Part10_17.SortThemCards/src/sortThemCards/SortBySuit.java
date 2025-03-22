package sortThemCards;

import java.util.Comparator;

/**
 * Comparator que ordena as cartas apenas pelo naipe (Suit).
 */
public class SortBySuit implements Comparator<Card> {
	@Override
	public int compare(Card c1, Card c2) {
		return c1.getSuit().ordinal() - c2.getSuit().ordinal();
	}
}