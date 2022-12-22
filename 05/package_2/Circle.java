package package_2;

import java.awt.*;

public class Circle extends Shape {
    @Override
    void drawShape(Graphics2D g, int WINDOW_WIDTH, int WINDOW_HEIGHT) {

        int diameter = (int) (Math.random() / 2 * Math.min(WINDOW_HEIGHT, WINDOW_WIDTH));

        g.setColor(this.color);
        g.fillOval((int) (this.x * WINDOW_WIDTH), (int) (this.y * WINDOW_HEIGHT), diameter, diameter);
    }
}
