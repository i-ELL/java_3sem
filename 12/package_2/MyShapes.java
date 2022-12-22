package package_2;

import java.awt.*;
import javax.swing.*;

class MyShapes extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;

    public MyShapes() {
        super("Shapes");
        setSize(500, 500);
        setBackground(Color.blue);
        //setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        random_shapes_paint(20, (Graphics2D) g);
    }

    void random_shapes_paint(int n, Graphics2D g) {
        for (int i = 0; i < n; i++) {
            int choice = (int) (Math.random() * 2);

            switch (choice) {

                case 0:
                    Rectangle rectangle = new Rectangle();
                    rectangle.drawShape((Graphics2D) this.getGraphics(), WINDOW_WIDTH, WINDOW_HEIGHT);
                    break;

                case 1:
                    Circle circle = new Circle();
                    circle.drawShape((Graphics2D) this.getGraphics(), WINDOW_WIDTH, WINDOW_HEIGHT);
                    break;

                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        MyShapes app = new MyShapes();
    }
}
