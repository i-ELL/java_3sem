package CircleEx6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double x, y, r;
        Scanner in = new Scanner(System.in);
        System.out.println("enter coordinates of center(x,y) and radius:  ");
        x = in.nextDouble();
        y = in.nextDouble();
        r = in.nextDouble();
        Circle CircleOne = new Circle(x, y, r);
        System.out.println("Area:  " + CircleOne.Area());
        System.out.println("Length of circle:  " + CircleOne.Per());

        System.out.println("enter the second circle coordinates of center(x,y) and radius:  ");
        x = in.nextDouble();
        y = in.nextDouble();
        r = in.nextDouble();
        Circle CircleTwo = new Circle(x, y, r);

        if (CircleOne.Equals(CircleTwo))      System.out.println("are equal");
        else System.out.println("not equal");

    }
}
