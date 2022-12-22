import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class proga2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       // in.close();
        Random r = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        //int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr.add(r.nextInt(100));
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\nn = " + n);
        int del = in.nextInt();
       // in.close();
        for (int i=arr.size()-1; i>=0; i--){
            if (arr.get(i) == del){
                arr.remove(i);
                //n--;
            }
        }

        for(int i=0; i< arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\nn = "+ arr.size());
        int del0 = in.nextInt();
        in.close();
        for(int i=arr.size()-1; i>=0; i--) {
            if (arr.get(i) % 10  == del0){
                arr.remove(i);
            }
        }
        for(int i=0; i< arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\nn = "+ arr.size());
    }
}
