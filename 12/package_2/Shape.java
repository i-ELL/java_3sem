package package_2;

import java.awt.*;

public abstract class Shape {
    Color color;
    double x;
    double y;

    abstract void drawShape(Graphics2D g, int WINDOW_WIDTH, int WINDOW_HEIGHT);

    Shape() {
        color = new Color((int) (Math.random() * 0x1000000));
        x = Math.random();
        y = Math.random();
    }
}