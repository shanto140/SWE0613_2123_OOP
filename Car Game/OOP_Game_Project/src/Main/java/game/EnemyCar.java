package game;

import javafx.scene.paint.Color;
import javafx.scene.image.Image;


public class EnemyCar extends Car {

    public EnemyCar(double x, double y, double width, double height) {
        super(x, y, width, height, Color.RED);
        setImage(new Image(getClass().getResourceAsStream("/images/enemyCar.png")));
    }

    public void moveDown(double speed) {
        y += speed;
    }
}
