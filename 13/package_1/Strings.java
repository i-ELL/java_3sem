package package_1;


import java.util.Scanner;

public class Strings {
    public static void WorkWithJava(String str){
        System.out.println("last symbol of line " + str.charAt(str.length() - 1));
        if (str.endsWith("!!!")) {
            System.out.println("line ends with !!!");
        }
        else {System.out.println("line is not ends with !!!");}
        if (str.startsWith("I like")) {
            System.out.println("line starts with I like");
        }
        else {System.out.println("line is not starts with I like");}
        if (str.contains("Java")) {
            System.out.println(" string contains a substring Java");
        }
        else {System.out.println("string is not contains a substring Java");}
        System.out.println("Lowercase string: " + str.toLowerCase());
        System.out.println("Uppercase string: " + str.toUpperCase());
        System.out.println("position of the Java substring in this string: " + str.indexOf("Java"));
        str = str.replace('a', 'o');
        System.out.println("line after replacing a with o: " + str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input line");
        String str = sc.nextLine();
        WorkWithJava(str);
    }
}

