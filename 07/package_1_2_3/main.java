package package_1_2_3;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        int x1, y1, x2, y2,  x1speed, y1speed, x2speed, y2speed;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter x and y for topleft ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        System.out.println("Enter x and y for bottomright ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        System.out.println("Enter speed of x and y for topleft ");
        x1speed = in.nextInt();
        y1speed = in.nextInt();

        System.out.println("Enter speed of x and y for bottomright ");
        x2speed = in.nextInt();
        y2speed = in.nextInt();

        MovableRectangle rec = new MovableRectangle(x1, y1, x2, y2, x1speed, y1speed, x2speed, y2speed);
        System.out.println(rec.toString());

        rec.moveLeft();
        System.out.println("moveleft " + rec.toString());

        rec.moveUp();
        System.out.println("moveup " +rec.toString());

        rec.moveRight();
        System.out.println("moveright " +rec.toString());

        rec.moveDown();
        System.out.println("movedown " +rec.toString());

        }

}



