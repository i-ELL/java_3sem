package package_4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input double a: ");
        double a = in.nextDouble();

        System.out.print("Input double b: ");
        double b = in.nextDouble();

        System.out.print("Input double radius: ");
        double radius = in.nextDouble();

        MathFunc mf = new MathFunc(a,b,radius);
        mf.exponentiation();
        mf.module();
        mf.length();

    }
}
