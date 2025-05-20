package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;


public abstract class Car {
    protected double x;
    protected double y;
    protected double width;
    protected double height;
    protected Color color;
    protected Image image;

    public Car(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void setImage(Image img) {
        this.image = img;
    }

    public void draw(GraphicsContext gc) {
        gc.drawImage(image, x, y, width, height);
    }

    public abstract boolean collidesWith(Car other);

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
