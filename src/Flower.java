
public class Flower extends Plant {
    private int old;

    public Flower(String name, double cost, int length, int old) {
        super(name, cost, length);
        this.old = old;
    }

    public int getOld() {
        return old;
    }

    @Override
    public String toString() {
        {
            return "Flower{" +
                    "cost=" + this.getCost() +
                    ", name='" + this.getName() + '\'' +
                    ", length=" + this.getLength() +
                    ", old=" + old +
                    "} + \n";
        }

    }
}
