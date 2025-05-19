package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PlayerCar {
    private double x, y, width, height;
    private final double MOVE_STEP = 10;
    private final double SCREEN_WIDTH = 400;
    private final double SCREEN_HEIGHT = 600;
    private Image image;

    public PlayerCar(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        // Load player car image
        image = new Image(getClass().getResourceAsStream("/images/playerCar.png"));
    }

    public void moveLeft() {
        if (x - MOVE_STEP >= 0) x -= MOVE_STEP;
    }

    public void moveRight() {
        if (x + width + MOVE_STEP <= SCREEN_WIDTH) x += MOVE_STEP;
    }

    public void moveUp() {
        if (y - MOVE_STEP >= 0) y -= MOVE_STEP;
    }

    public void moveDown() {
        if (y + height + MOVE_STEP <= SCREEN_HEIGHT) y += MOVE_STEP;
    }

    public void draw(GraphicsContext gc) {
        gc.drawImage(image, x, y, width, height);
    }

    public boolean collidesWith(EnemyCar enemy) {
        return x < enemy.getX() + enemy.getWidth() &&
                x + width > enemy.getX() &&
                y < enemy.getY() + enemy.getHeight() &&
                y + height > enemy.getY();
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
