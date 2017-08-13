
abstract class Plant {
    private String name;
    private double  cost;
    private int length;

    public Plant(String name, double cost, int length) {
        this.name = name;
        this.cost = cost;
        this.length = length;
    }


    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }
}
