import java.util.Scanner;
public class proga1_1 {
    public static void main(String[] args) {

        System.out.println("size: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int  sum1 = 0, sum2= 0;
        System.out.println("elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < n; i++) {
            //sum = sum+ arr[i];
            System.out.print(arr[i]+" ");
        }


        int i=0;
        while(i<n){
            sum1 = sum1 +arr[i];
            i++;
        }


        i=0;
        do {
            sum2 = sum2 + arr[i];
            i++;
        } while (i<n);


        System.out.println();
        System.out.println(sum1 +" "+ sum2);
    }
}
