package package_4;
import java.lang.*;

interface Priceable {
    int getPrice();

    class Bags implements Priceable{
        private int price;
        public Bags(){
            this.price=(int)(Math.random()* 10000000);
        }
        public int getPrice(){

            return price;
        }
    }
    class Cheese implements Priceable{
        private int price;
        public Cheese(){
            this.price=(int)(Math.random()* 1000);
        }
        public int getPrice(){

            return price;
        }
    }

    public static void main(String[] args) {
        Bags bag1 = new Bags();
        System.out.println("bag = " + bag1.getPrice());

        Cheese ch1 = new Cheese();
        System.out.println("cheese cost " + ch1.getPrice() + " per kg");
    }

}
