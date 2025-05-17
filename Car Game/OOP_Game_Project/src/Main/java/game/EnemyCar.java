package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class EnemyCar {
    private double x, y, width, height;

    public EnemyCar(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveDown(double speed) {
        y += speed;
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.RED);
        gc.fillRect(x, y, width, height);
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
