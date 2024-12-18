package Herds;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
	
	private List<Movable> organisms;
	
	public Herd() {
        this.organisms = new ArrayList<>();
    }
	
	public void addToHerd(Movable moveble) {
		organisms.add(moveble);
	}	
	
	@Override
	public void move(int dx, int dy) {
		 for (Movable organism : organisms) {
	            organism.move(dx, dy); // Move cada membro individualmente
	        }
	}

	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
	        for (Movable organism : organisms) {
	            sb.append(organism.toString()).append("\n");
	        }
	        return sb.toString();
	}
}
