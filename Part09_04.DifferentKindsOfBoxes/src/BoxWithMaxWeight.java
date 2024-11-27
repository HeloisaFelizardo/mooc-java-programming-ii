 
import java.util.ArrayList;
 
public class BoxWithMaxWeight extends Box {
 
    private ArrayList<Item> items;
    private int maxweight;
 
    public BoxWithMaxWeight(int capacity) {
        this.maxweight = capacity;
        this.items = new ArrayList<>();
    }
 
    @Override
    public void add(Item item) {
        if (this.weightOfItems() + item.getWeight() > this.maxweight) {
            return;
        }
 
        this.items.add(item);
    }
 
    @Override
    public boolean isInBox(Item tavara) {
        return this.items.contains(tavara);
    }
 
    private int weightOfItems() {
        int weight = 0;
        for (Item item : this.items) {
            weight = weight + item.getWeight();
        }
 
        return weight;
    }
}
 