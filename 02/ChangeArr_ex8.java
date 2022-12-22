import java.util.Scanner;

public class ChangeArr_ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of array  ");
        int n;
        n = in.nextInt();
        in.nextLine();
        String[] arr = new String[n];
        String s;
        for(int i =0; i<n; i++){
            s = in.nextLine();
            arr[i] = s;
        }
        for(int i=0; i< n/2; i++){
            s = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = s;

        }

        for(int i =0; i<n; i++){
            System.out.println(i + ": "+ arr[i]);
        }

    }
}
