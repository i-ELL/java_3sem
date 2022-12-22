package pack_2;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        double x;
        double y;
        ball oldball = new ball();
        Scanner s = new Scanner(System.in);
        System.out.println("enter x and y for the first ball\n");
        x = s.nextDouble();
        y = s.nextDouble();
        oldball.setXY(x, y);

        System.out.println("enter the numbers(2) you want to move\n");
        x = s.nextDouble();
        y = s.nextDouble();
        oldball.move(x, y);

        System.out.println("new position:  " + oldball.toString());

        ball newball = new ball(0.0, 0.0);
        System.out.println("enter x for the second ball:  ");
        x = s.nextDouble();
        newball.setX(x);
        System.out.println("enter y for the second ball:  ");
        y = s.nextDouble();
        newball.setY(y);

        System.out.println("new ball:  x = " + newball.getX() + ",  y = " + newball.getY());



    }
}
