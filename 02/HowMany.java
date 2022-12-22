import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("enter your text  ");
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        int n =0;
        /*for(int i =0; i<s.length(); i++){
            if (s.charAt(i) == ' ') n++;
        }
        if (s != "") n++;
        System.out.println(n);
        */
        String[] words = s.split(" +");
        for(String word : words){
            System.out.println(word);
            n++;
        }
        System.out.println("n: " + n);
    }
}
