package package_1_2_3;
import javax.swing.JPanel;

class MovableRectangle  extends JPanel implements package_1_2_3.Movable {
    public MovablePoint topLeft, bottomRight;


    MovableRectangle(int x1, int y1, int x2, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        this.topLeft = new MovablePoint(x1, y1, x1Speed, y1Speed);
        this.bottomRight = new MovablePoint(x2, y2, x2Speed, y2Speed);
    }

    public boolean speedTest(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    @Override
    public void moveUp() {
        if (speedTest()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (speedTest()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveRight() {
        if (speedTest()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public void moveLeft() {
        if (speedTest()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public String toString() {
        return  "Rectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';

    }


}