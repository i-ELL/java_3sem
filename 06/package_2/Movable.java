package package_2;

import java.util.*;
interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}
    class MovablePoint implements package_2.Movable {

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
        public String toString() {
            return "Point{" + x + "; " + y + "}";
        }

    }
    class MovableRectangle implements package_2.Movable {
        public MovablePoint topLeft, bottomRight;
        MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
            this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }

        @Override
        public void moveUp() {
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }

        @Override
        public void moveDown() {
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }

        @Override
        public void moveRight() {
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }

        @Override
        public void moveLeft() {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
        @Override
        public String toString(){
            return "Rectangle{("+ topLeft.x + "; " + topLeft.y +"), (" + bottomRight.x + "; " +bottomRight.y + ")}";
        }
    }
    class Main{
        public static void main(String[] args) {
            int x1, y1, x2, y2,  x1speed, y1speed, x2speed, y2speed;
            Scanner in = new Scanner(System.in);
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
            x1speed = in.nextInt();
            y1speed = in.nextInt();
            x2speed = in.nextInt();
            y2speed = in.nextInt();
            if (x1speed == x2speed && y1speed == y2speed) {
                MovableRectangle rec = new MovableRectangle(x1, y1, x2, y2, x1speed, y2speed);
                System.out.println(rec.toString());

                rec.moveLeft();
                rec.moveUp();

                System.out.println(rec.toString());
            }
        }
    }
