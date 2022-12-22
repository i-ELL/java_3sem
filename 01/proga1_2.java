import java.util.Scanner;
import java.util.Random;
public class proga1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =(int)( Math.random() *100);
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();



        Random r = new Random();
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++) {
            arr2[i] = r.nextInt(100) ;
            System.out.print(arr2[i] + " ");
        }
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++){
                if (arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
