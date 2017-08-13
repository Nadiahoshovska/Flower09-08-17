import java.util.ArrayList;
import java.util.List;


public class Shop {
    private List<Bouquet> bouquets=new ArrayList<Bouquet>() ;

    public static Bouquet add (Bouquet bouquet, Flower flower){
        bouquet.add(flower);
        return bouquet;
    }

    public static Bouquet add (Bouquet bouquet, Cactus cactus){
        bouquet.add(cactus);
        return bouquet;
    }
    public  List<Bouquet> addBuket(Bouquet b){
        bouquets.add(b);
        return  bouquets;
    }

    public List<Bouquet> getBukets() {
        return bouquets;
    }

    public void setBukets(List<Bouquet> bukets) {
        this.bouquets = bukets;
    }

    public  void fresher(){
        double fresh = bouquets.get(0).getFresh();

        Bouquet buket = bouquets.get(0);
        for (Bouquet bouquet : bouquets){
            if (fresh > bouquet.getFresh()){
                fresh = bouquet.getFresh();

                buket = bouquet;
            }
        }
        System.out.println("The Fresher bouquet in " + this+" is "+buket+"\n");

    }
    public  void findBuketWithFlower(Flower flower){
        boolean tic = true;
        for(Bouquet bouquet: this.bouquets){
            for (Flower otherFlower : bouquet.getFlowersList()){
                if(flower.equals(otherFlower)){
                    System.out.println(flower + " is in "+ bouquet+"\n");
                    tic = false;
                    break;
                }

            }
        }
        if (tic){
            System.out.println("We don't have bouquet with this " + flower+"\n");
        }
    }
    public  void findBuketWithCactus(Cactus cactus){
        boolean tic = true;
        for(Bouquet buk: this.bouquets){
            for (Cactus otherCactus : buk.getCactusesList()){
                if(cactus.equals(otherCactus)){
                    System.out.println(cactus + " is in "+ buk+"\n");
                    tic = false;
                    break;
                }

            }
        }
        if (tic){
            System.out.println("We don't have bouquets with this " + cactus+"\n");
        }
    }



    public  static void main (String args[]){
        Flower rozaMedium = new Flower("roseMedium",30,81,1);
        Flower rozaLong = new Flower("roseLong",40,120,1);
        Flower rozaShort = new Flower("roseShort",50,56,2);
        Flower liliaLong = new Flower("liliaLong",96,100,1);
        Flower liliaSyper = new Flower("liliaSyper",35,85,6);
        Flower liliaNice = new Flower("liliaNice",80,81,5);
        Flower romashkaCool = new Flower("romashkaCool",15,33,2);
        Flower romashkaNice = new Flower("romashkaNice",22,24,1);
        Flower romashkaLong = new Flower("romashkaLong",56,59,2);
        Cactus cactusRound = new Cactus("kakatusRound",66,23,Form.Round);
        Cactus cactusLong = new Cactus("kakatusLong",100,85,Form.Longer);




        Bouquet buk1 = new Bouquet();
        buk1.add(rozaLong);

        buk1.add(liliaLong);
        buk1.add(romashkaCool);
        buk1.add(cactusRound);
        System.out.println(buk1);
        buk1.getFresh();
        buk1.getPrice();
        buk1.maxLength();


        Bouquet buk2 = new Bouquet();
        buk2.add(rozaMedium);
        buk2.add(liliaSyper);
        buk2.add(romashkaLong);
//        buk2.maxLength();


        Bouquet buk3 = new Bouquet();
        buk3.add(rozaShort);
        buk3.add(liliaNice);
        buk3.add(romashkaNice);


        add(buk1,cactusLong);
        add(buk2,romashkaNice);
//        System.out.println(buk1);

        ArrayList<Bouquet> buketsInShop = new ArrayList<Bouquet>();
        buketsInShop.add(buk1);

        Shop shop = new Shop();
        shop.setBukets(buketsInShop);
        shop.addBuket(buk2);
        shop.fresher();

       shop.findBuketWithFlower(romashkaNice);
        shop.findBuketWithCactus(cactusLong);








    }
}

