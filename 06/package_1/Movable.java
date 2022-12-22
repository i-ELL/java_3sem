package package_1;
import java.util.*;
interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();

    class MovablePoint implements Movable {

        public int x, y, xSpeed, ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }


        @Override
        public void moveUp() {
            y -= ySpeed;
        }

        @Override
        public void moveDown() {
            y += ySpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }
        @Override
        public String toString(){
            return "Point{"+ x +"; " + y + "}";
        }

    }
    class MovableCircle implements Movable{
        public int radius;
        public MovablePoint center;
        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.radius = radius;
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);

        }

        @Override
        public void moveUp() {
            center.y -= center.ySpeed;
        }

        @Override
        public void moveDown() {
            center.y += center.ySpeed;
        }

        @Override
        public void moveRight() {
            center.x += center.xSpeed;
        }

        @Override
        public void moveLeft() {
            center.x -= center.xSpeed;
        }
        @Override
        public String toString(){
            return "Circle{ center("+ center.x +"; " + center.y + "), radius: " + radius + "}";
        }

    }

    class Main{
        public static void main(String[] args) {
            int x, y, xspeed, yspeed, r;
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            y = in.nextInt();
            xspeed = in.nextInt();
            yspeed = in.nextInt();
            r = in.nextInt();

            MovableCircle c = new MovableCircle(x, y, xspeed, yspeed, r);
            System.out.println(c.toString());

            c.moveDown();
            c.moveRight();
            System.out.println(c.toString());
        }
    }
}
