package package_5_6;

import  java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = console.nextLine();

        ClassStrings classStrings = new ClassStrings(str);
        classStrings.length();
        classStrings.odd_string();
        classStrings.reverse();
    }
}
