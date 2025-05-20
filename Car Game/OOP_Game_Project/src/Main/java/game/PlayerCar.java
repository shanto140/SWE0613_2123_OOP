package game;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class PlayerCar extends Car {
    private static final double STEP = 3;

    public PlayerCar(double x, double y, double width, double height) {
        super(x, y, width, height, Color.GREEN);
        setImage(new Image(getClass().getResourceAsStream("/images/playerCar.png")));
    }
    public boolean collidesWith(Car other) {
        return x < other.x + other.width &&
                x + width > other.x &&
                y < other.y + other.height &&
                y + height > other.y;
    }

    public void moveLeft() { x -= STEP; }

    public void moveRight() { x += STEP; }

    public void moveUp() {
        y -= STEP;
    }

    public void moveDown() {
        y += STEP;
    }
}
