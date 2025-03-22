package sortThemCards;

public class Card implements Comparable<Card> {

	private int value; // Valor da carta (2 a 14, onde 11 = J, 12 = Q, 13 = K, 14 = A)
	private Suit suit; // Naipe da carta

	// Construtor da classe Card
	public Card(int value, Suit suit) {
		// Valida se o valor da carta está no intervalo permitido (2 a 14)
		if (value < 2 || value > 14) {
			throw new IllegalArgumentException("Card value must be in range 2...14.");
		}
		this.value = value;
		this.suit = suit;
	}

	// Retorna a representação textual da carta (exemplo: "HEART A" para Ás de
	// Copas)
	@Override
	public String toString() {
		String cardValue = "" + value;
		switch (value) {
		case 11:
			cardValue = "J";
			break;
		case 12:
			cardValue = "Q";
			break;
		case 13:
			cardValue = "K";
			break;
		case 14:
			cardValue = "A";
			break;
		default:
			break;
		}
		return suit + " " + cardValue;
	}

	// Métodos getters para acessar o valor e o naipe da carta
	public int getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

	// Implementação da interface Comparable para permitir ordenação natural
	@Override
	public int compareTo(Card otherCard) {
		// Compara primeiro pelo valor da carta
		int valueComparison = Integer.compare(this.value, otherCard.value);

		// Se os valores forem iguais, compara pelo naipe (ordinal do enum Suit)
		return (valueComparison != 0) ? valueComparison
				: Integer.compare(this.suit.ordinal(), otherCard.suit.ordinal());
	}
}
