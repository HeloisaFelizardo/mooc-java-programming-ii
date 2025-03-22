package sortThemCards;

import java.util.*;

/**
 * Classe que representa uma mão de cartas e fornece funcionalidades para
 * manipulá-las.
 */
public class Hand implements Comparable<Hand> {

	private List<Card> cards; // Lista de cartas da mão

	// Construtor que inicializa a lista de cartas
	public Hand() {
		this.cards = new ArrayList<>();
	}

	// Adiciona uma carta à mão
	public void add(Card card) {
		cards.add(card);
	}

	// Exibe todas as cartas da mão no console
	public void print() {
		Iterator<Card> iterator = cards.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	// Ordena a mão usando a ordenação natural definida na classe Card (valor e
	// depois naipe)
	public void sort() {
		Collections.sort(cards);
	}

	// Ordena a mão primeiro pelo naipe e depois pelo valor da carta
	public void sortBySuit() {
		Collections.sort(cards, new BySuitInValueOrder());
	}

	// Calcula o valor total da mão (soma dos valores das cartas)
	public int getHandValue() {
		int sum = 0;
		for (Card card : cards) {
			sum += card.getValue();
		}
		return sum;
	}

	// Compara duas mãos pelo valor total das cartas
	@Override
	public int compareTo(Hand otherHand) {
		return Integer.compare(this.getHandValue(), otherHand.getHandValue());
	}
}
