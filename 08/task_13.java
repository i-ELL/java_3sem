import java.util.Scanner;

public class task_13 {

    public static void rec(){
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        if (temp == 0) return;
        System.out.println(temp);
        int temp2 =  in.nextInt();
        rec();

    }
    public static void main(String[] args) {
        rec(); // вызов рекурсивной функции
    }
}


