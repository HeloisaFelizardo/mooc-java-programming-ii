package cargo;

public class Main {

	public static void main(String[] args) {
		// Criando alguns itens
		Item item1 = new Item("Laptop", 2);
		Item item2 = new Item("Book", 1);
		Item item3 = new Item("Clothes", 5);
		Item item4 = new Item("Shoes", 3);

		// Criando uma mala com peso máximo
		Suitcase suitcase1 = new Suitcase(10);
		suitcase1.addItem(item1);
		suitcase1.addItem(item2);

		Suitcase suitcase2 = new Suitcase(10);
		suitcase2.addItem(item3);
		suitcase2.addItem(item4);

		// Criando o compartimento (Hold)
		Hold hold = new Hold(30);
		hold.addSuitcase(suitcase1);
		hold.addSuitcase(suitcase2);

		// Exibindo o total de peso no compartimento
		System.out.println("Total weight in hold: " + hold.totalWeight() + " kg");

		// Exibindo os itens no compartimento
		hold.printItems();

		// Encontrando a mala mais pesada no compartimento
        Suitcase heaviestSuitcase = hold.getSuitcases().stream()
            .max((s1, s2) -> Integer.compare(s1.totalWeight(), s2.totalWeight()))
            .orElse(null);

        System.out.println("Heaviest suitcase: " + (heaviestSuitcase != null ? heaviestSuitcase : "No suitcases"));
	}

}
