
public class Cactus extends Plant{
    Form form;

    public Cactus(String name, double cost, int length, Form form) {
        super(name, cost, length);
        this.form = form;
    }

    public Form getForm() {
        return form;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "cost = " + this.getCost() +
                ", name = '" + this.getName() + '\'' +
                ", length =" + this.getLength() +
                ", form = " + form +
                '}';
    }
}
