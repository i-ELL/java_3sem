import java.util.Scanner;

public class task_12 {

    public static void rec(){
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        if (temp == 0) return;
        if(temp % 2 ==1) System.out.println(temp);
        rec();
    }
    public static void main(String[] args) {
        rec();
    }
}
