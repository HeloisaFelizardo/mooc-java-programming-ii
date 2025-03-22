package sortThemCards;

import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		// Exercise 1: Criando uma lista de cartas e ordenando por valor e naipe
		List<Card> cards = new ArrayList<>();
		cards.add(new Card(2, Suit.DIAMOND));
		cards.add(new Card(14, Suit.SPADE));
		cards.add(new Card(12, Suit.HEART));

		Collections.sort(cards); // Ordena as cartas pela ordem natural definida em Card
		cards.forEach(System.out::println); // Exibe as cartas ordenadas

		// Exercise 2: Criando uma mão e adicionando cartas
		Hand hand = new Hand();
		hand.add(new Card(2, Suit.DIAMOND));
		hand.add(new Card(14, Suit.SPADE));
		hand.add(new Card(12, Suit.HEART));
		hand.add(new Card(2, Suit.SPADE));

		hand.print(); // Exibe as cartas na mão

		// Exercise 3: Ordenando as cartas dentro da mão
		hand.sort(); // Ordena as cartas na mão
		hand.print(); // Exibe as cartas ordenadas

		// Exercise 4: Comparando duas mãos pelo valor total das cartas
		Hand hand1 = new Hand();
		hand1.add(new Card(2, Suit.DIAMOND));
		hand1.add(new Card(14, Suit.SPADE));
		hand1.add(new Card(12, Suit.HEART));
		hand1.add(new Card(2, Suit.SPADE));

		Hand hand2 = new Hand();
		hand2.add(new Card(11, Suit.DIAMOND));
		hand2.add(new Card(11, Suit.SPADE));
		hand2.add(new Card(11, Suit.HEART));

		int comparison = hand1.compareTo(hand2); // Compara as mãos pelo valor total

		if (comparison < 0) {
			System.out.println("better hand is");
			hand2.print();
		} else if (comparison > 0) {
			System.out.println("better hand is");
			hand1.print();
		} else {
			System.out.println("hands are equal");
		}

		// Exercise 5: Ordenando cartas por naipe
		cards.add(new Card(3, Suit.SPADE));
		cards.add(new Card(2, Suit.DIAMOND));
		cards.add(new Card(14, Suit.SPADE));
		cards.add(new Card(12, Suit.HEART));
		cards.add(new Card(2, Suit.SPADE));

		SortBySuit sortBySuitSorter = new SortBySuit();
		Collections.sort(cards, sortBySuitSorter); // Ordena as cartas pelo naipe
		cards.forEach(System.out::println); // Exibe as cartas ordenadas por naipe

		// Outra maneira de ordenar por naipe diretamente
		Collections.sort(cards, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());

		// Exercise 6: Ordenação personalizada por naipe e depois por valor
		Collections.sort(cards, new BySuitInValueOrder());
		cards.forEach(System.out::println); // Exibe as cartas ordenadas por naipe e valor

		// Exercise 7: Ordenando uma mão por naipe
		Hand handSortedBySuit = new Hand();
		handSortedBySuit.add(new Card(12, Suit.HEART));
		handSortedBySuit.add(new Card(4, Suit.SPADE));
		handSortedBySuit.add(new Card(2, Suit.DIAMOND));
		handSortedBySuit.add(new Card(14, Suit.SPADE));
		handSortedBySuit.add(new Card(7, Suit.HEART));
		handSortedBySuit.add(new Card(2, Suit.SPADE));

		handSortedBySuit.sortBySuit(); // Ordena a mão por naipe
		handSortedBySuit.print(); // Exibe as cartas ordenadas por naipe
	}

}
