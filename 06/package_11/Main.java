package package_11;

import java.util.Scanner;

public class Main  implements Convertable{
    public void convert(double n){
    double kel, far;
    far = 1.8*n + 32;
    kel = n + 273.15;
    System.out.println("celsius: " + n + " fahrenheit: " + far + " kelvin: " + kel);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter degrees  ");
        double n = in.nextDouble();
        Main m = new Main();
        m.convert(n);

    }
}
