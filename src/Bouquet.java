import java.util.ArrayList;
import java.util.List;


public class Bouquet {
    private  List<Flower> flowers = new ArrayList<Flower>();
    private  List<Cactus> cactuses = new ArrayList<Cactus>();

    public Bouquet(List<Cactus> cactuses, List<Flower> flowers) {
        this.cactuses = cactuses;
        this.flowers = flowers;
    }


    public Bouquet() {
    }

    public void add(Flower  f){
        this.flowers.add(f);
    }
    public void add(Cactus  c){
        this.cactuses.add(c);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Cactus> getCactuses() {
        return cactuses;

    }

    public void getPrice(){
        double price = 0;
        for (Flower flower : flowers){
            price = price + flower.getCost();
        }
        for (Cactus cactus : cactuses){
            price = price + cactus.getCost();
        }
        System.out.println("Price " + this + " is " + price +"\n");
    }

    public Flower maxLength(){
        int lengthFlower = flowers.get(0).getLength();
        Flower longestFlower = flowers.get(0);
        for (Flower flower : flowers){
            if (lengthFlower < flower.getLength()){
                lengthFlower = flower.getLength();
                longestFlower = flower;
            }
        }
            System.out.println("The longest  in " + this + " is " + longestFlower + "\n");
        return  longestFlower;
        }


    public double getFresh (){
        double sum = 0;
        for (Flower flower : flowers){
            sum = sum + flower.getDays();
        }
        sum = sum/flowers.size();
        return sum;
    }

    @Override
    public String toString() {
        String line = "";
        for (Flower flower : flowers){
            line = line + flower.toString()+ "\n";
        }
        for (Cactus cactus : cactuses){
            line = line + cactus.toString()+ "\n";
        }
        return "Bouquet{ \n" + line + " }";
    }

    }

