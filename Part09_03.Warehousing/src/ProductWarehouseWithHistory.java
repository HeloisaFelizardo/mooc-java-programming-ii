public class ProductWarehouseWithHistory extends ProductWarehouse {
 
    private ChangeHistory history;
 
    public ProductWarehouseWithHistory(String name, double capacity, double initalBalance) {
        super(name, capacity);
        history = new ChangeHistory();
        addToWarehouse(initalBalance);
    }
 
    public String history() {
        return history.toString();
    }
 
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
 
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }
 
    @Override
    public double takeFromWarehouse(double amount) {
        double received = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return received;
    }
}