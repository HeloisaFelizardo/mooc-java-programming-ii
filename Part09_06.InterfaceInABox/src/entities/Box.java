package entities;

import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maxCapacity) {
            items.add(item);
        }
    }

    public void add(Box box) {
        if (weight() + box.weight() <= maxCapacity) {
            items.add(box);
        } 
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable itemInBox : items) {
            weight += itemInBox.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
