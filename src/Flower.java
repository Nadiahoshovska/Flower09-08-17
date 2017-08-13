
public class Flower extends Plant {
    private int days;

    public Flower(String name, double cost, int length, int days) {
        super(name, cost, length);
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        {
            return "Flower{" +
                    "cost = " + this.getCost() +
                    ", name = '" + this.getName() + '\'' +
                    ", length = " + this.getLength() +
                    ", count days = " + days +
                    "} + \n";
        }

    }
}
