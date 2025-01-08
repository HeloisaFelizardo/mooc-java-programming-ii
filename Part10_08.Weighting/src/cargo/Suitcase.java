package cargo;

import java.util.ArrayList;

public class Suitcase {

	private int maximumWeight;
	private ArrayList<Item> Items;

	public Suitcase(int maximumWeight) {
		this.Items = new ArrayList<>();
		this.maximumWeight = maximumWeight;
	}

	public void addItem(Item Item) {
		if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
			return;
		}

		this.Items.add(Item);
	}

	public int totalWeight() {
		return this.Items.stream().mapToInt(Item::getWeight).sum();
	}

	public void printItems() {
		 this.Items.forEach(System.out::println); 
	}

	public Item heaviestItem() {		
		return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).orElse(null);
	}

	@Override
	public String toString() {
		if (this.Items.isEmpty()) {
			return "no items (0 kg)";
		}

		if (this.Items.size() == 1) {
			return "1 item (" + this.totalWeight() + " kg)";
		}

		return this.Items.size() + " items (" + this.totalWeight() + " kg)";
	}
}
