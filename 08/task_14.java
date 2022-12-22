import java.util.Scanner;

public class task_14 {

    public static String rec(int n){
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return rec(n / 10) + " " + n % 10;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       System.out.println( rec(n));
    }
}
