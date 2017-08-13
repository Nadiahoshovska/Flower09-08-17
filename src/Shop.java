import java.util.ArrayList;
import java.util.List;


public class Shop {
    private List<Bouquet> bukets=new ArrayList<Bouquet>() ;

    public static Bouquet add (Bouquet bouquet, Flower flower){
        bouquet.add(flower);
        return bouquet;
    }

    public static Bouquet add (Bouquet bouquet, Cactus cactus){
        bouquet.add(cactus);
        return bouquet;
    }
    public  List<Bouquet> addBuket(Bouquet b){
        this.bukets.add(b);
        return  this.bukets;
    }

    public List<Bouquet> getBukets() {
        return bukets;
    }

    public void setBukets(List<Bouquet> bukets) {
        this.bukets = bukets;
    }

    public  void fresher(){
        double fresh = this.bukets.get(0).getFresh();

        Bouquet buket = this.bukets.get(0);
        for (Bouquet b : this.bukets){
            if (fresh > b.getFresh()){
                fresh = b.getFresh();

                buket = b;
            }
        }
        System.out.println("The Fresher buket in " + this+" is "+buket+"\n");

    }
    public  void findBuketWithFlower(Flower f){
        boolean tic = true;
        for(Bouquet buk: this.bukets){
            for (Flower fl : buk.getFlowersList()){
                if(f.equals(fl)){
                    System.out.println(f + " is in "+ buk+"\n");
                    tic = false;
                    break;
                }

            }
        }
        if (tic){
            System.out.println("We don't have buket with this " + f+"\n");
        }
    }
    public  void findBuketWithCactus(Cactus f){
        boolean tic = true;
        for(Bouquet buk: this.bukets){
            for (Cactus fl : buk.getCactusesList()){
                if(f.equals(fl)){
                    System.out.println(f + " is in "+ buk+"\n");
                    tic = false;
                    break;
                }

            }
        }
        if (tic){
            System.out.println("We don't have buket with this " + f+"\n");
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
        Flower romashkaLong = new Flower("romashkaLong",56,58,2);
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

