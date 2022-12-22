import java.util.Scanner;


public class task_15 {
    public static void rec(int n){
        System.out.print(n %10 + " ");
        if (n /10 == 0) return;
        rec(n/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        rec(n);
    }
}
