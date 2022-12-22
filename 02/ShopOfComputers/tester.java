package ShopOfComputers;
import java.util.Scanner;

public class tester {
    public static void main(String[] args){
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //in.nextInt();
        in.nextLine();
        String name;
        for(int i = 0; i < n; i++) {
            System.out.println("enter computer  ");

            name = in.nextLine();
            shop.addComputer(new Computer(name));
        }
        shop.deleteComputer("hp");
        System.out.print("acer: ");
        shop.findComputer("acer");

    }
}