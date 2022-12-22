package package_4;

import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("error converting a string to a number");
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        finally {
            System.out.println("Inside block finally");
        }
    }
}