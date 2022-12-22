package PointCircle;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r,x,y;
        System.out.println("enter the number of elements in the array  ");
        int n;
        n = s.nextInt();
        Circle[] arr = new Circle[n];
        for (int i = 0; i<n;i++){

            System.out.println(i+1 + ": enter the radius  ");
            r = s.nextDouble();

            System.out.println(i+1 + ": enter the first and the second coordinates  ");
            x = s.nextDouble();
            y = s.nextDouble();

            Point xy = new Point(x,y);
            arr[i] = new Circle(xy, r);
        }
        for (int i = 0; i<n;i++) {
            System.out.println(i+1 + ": Center: " + arr[i].getCentre().getX() +", " + arr[i].getCentre().getY()+ "; Radius: " + arr[i].getR());
            }
        }

}
