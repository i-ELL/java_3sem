import java.util.Scanner;
public class proga2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int st = in.nextInt();
        in.close();
        int l = 0, k = 1, m;
        for (int i=0; i<len+st; i++){
            if(i>=st) System.out.print(l + " ");
            m = l+ k;
            l=k;
            k=m;
        }

    }

}
