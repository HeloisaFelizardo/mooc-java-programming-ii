import java.util.ArrayList;
 
public class ChangeHistory {
 
    private ArrayList<Double> states;
 
    public ChangeHistory() {
        this.states = new ArrayList<>();
    }
 
    public void add(double status) {
        this.states.add(status);
    }
 
    public void clear() {
        this.states.clear();
    }
 
    public double minValue() {
        double min = this.states.get(0);
        for (Double d : this.states) {
            if (min > d) {
                min = d;
            }
        }
        return min;
    }
 
    public double maxValue() {
        double max = this.states.get(0);
        for (Double d : this.states) {
            if (max < d) {
                max = d;
            }
        }
        return max;
    }
 
    public double average() {
        if (this.states.isEmpty()) {
            return 0;
        }
 
        double sum = 0;
        for (Double change : this.states) {
            sum = sum + change;
        }
 
        return sum / this.states.size();
    }
 
    @Override
    public String toString() {
        return states.toString();
    }
}