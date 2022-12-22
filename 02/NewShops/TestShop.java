package NewShops;

import java.util.Scanner;
import java.util.Vector;
public class TestShop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter numbers of computers ");
        int n;
        n = in.nextInt();
        in.nextLine();
        Vector<String> c;
        Shop ones = new Shop();
        String s;
        for (int i=0; i<n; i++){
            System.out.println("enter computer ");
            s = in.nextLine();
            ones.add(s);
        }

        for(int i =0; i<ones.getN(); i++){
          //  System.out.println(i+ ": " + ones.getComps().elementAt(i));
        }
    }
}
