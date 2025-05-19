package game;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import game.PlayerCar;
import game.EnemyCar;

public class LaneCarGame extends Application {

    private final int WIDTH = 400;
    private final int HEIGHT = 600;
    private final int LANE_COUNT = 5;
    private final double LANE_WIDTH = WIDTH / (double) LANE_COUNT;

    private Scene menuScene, gameScene, gameOverScene;
    private Stage window;

    private Canvas canvas;
    private GraphicsContext gc;

    private PlayerCar player;
    private List<EnemyCar> enemies = new ArrayList<>();
    private Random random = new Random();

    private boolean leftPressed, rightPressed, upPressed, downPressed;
    private int score = 0;
    private double enemySpeed = 2;
    private long lastEnemySpawnTime = 0;
    private final long enemySpawnInterval = 1000000000;

    private AnimationTimer gameLoop;

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Lane Based Car Game");

        createMenuScene();
        createGameScene();
        createGameOverScene();

        window.setScene(menuScene);
        window.show();

    }

    private void createMenuScene() {
        Button playBtn = new Button("Play");
        Button exitBtn = new Button("Exit");
        playBtn.setOnAction(e -> {
            resetGame();
            window.setScene(gameScene);
            gameLoop.start();
        });
        exitBtn.setOnAction(e -> {
            // Close the application
            Platform.exit();
        });

        VBox menuLayout = new VBox(30);

        menuLayout.setStyle("-fx-background-color: black; -fx-alignment: center;");
        playBtn.setStyle("-fx-font-size: 24px; -fx-padding: 10px 20px;");
        exitBtn.setStyle("-fx-font-size: 24px; -fx-padding: 10px 20px;");

        menuLayout.getChildren().add(playBtn);
        menuLayout.getChildren().add(exitBtn);


        menuScene = new Scene(menuLayout, WIDTH, HEIGHT);
    }

    private void createGameScene() {
        canvas = new Canvas(WIDTH, HEIGHT);
        gc = canvas.getGraphicsContext2D();

        StackPane gameLayout = new StackPane(canvas);
        gameScene = new Scene(gameLayout);

        gameScene.setOnKeyPressed(e -> {
            KeyCode code = e.getCode();
            switch (code) {
                case LEFT -> leftPressed = true;
                case RIGHT -> rightPressed = true;
                case UP -> upPressed = true;
                case DOWN -> downPressed = true;
            }
        });

        gameScene.setOnKeyReleased(e -> {
            KeyCode code = e.getCode();
            switch (code) {
                case LEFT -> leftPressed = false;
                case RIGHT -> rightPressed = false;
                case UP -> upPressed = false;
                case DOWN -> downPressed = false;
            }
        });

        player = new PlayerCar(WIDTH / 2 - 20, HEIGHT - 80, 40, 70);

        gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update(now);
                draw();
            }
        };
    }

    private void createGameOverScene() {
        Button playAgainBtn = new Button("Play Again");
        playAgainBtn.setOnAction(e -> {
            resetGame();
            window.setScene(gameScene);
            gameLoop.start();
        });

        VBox gameOverLayout = new VBox(20);
        gameOverLayout.setStyle("-fx-background-color: black; -fx-alignment: center;");
        gameOverLayout.getChildren().addAll(playAgainBtn);

        gameOverScene = new Scene(gameOverLayout, WIDTH, HEIGHT);
    }

    private void resetGame() {
        player.setPosition(WIDTH / 2 - 20, HEIGHT - 80);
        enemies.clear();
        score = 0;
        enemySpeed = 2;
        lastEnemySpawnTime = 0;
    }

    private void update(long now) {
        if (leftPressed) player.moveLeft();
        if (rightPressed) player.moveRight();
        if (upPressed) player.moveUp();
        if (downPressed) player.moveDown();


        if (now - lastEnemySpawnTime > enemySpawnInterval) {
            spawnEnemy();
            lastEnemySpawnTime = now;
        }

        Iterator<EnemyCar> it = enemies.iterator();
        while (it.hasNext()) {
            EnemyCar enemy = it.next();
            enemy.moveDown(enemySpeed);

            if (player.collidesWith(enemy)) {
                gameLoop.stop();
                showGameOver();
                return;
            }

            if (enemy.getY() > HEIGHT) {
                it.remove();
                score++;
                if (score % 5 == 0) enemySpeed += 0.3;
            }
        }
    }

    private void spawnEnemy() {
        int lane = random.nextInt(LANE_COUNT);
        double enemyX = lane * LANE_WIDTH + LANE_WIDTH / 2 - 20;
        enemies.add(new EnemyCar(enemyX, -70, 40, 70));
    }

    private void draw() {
        gc.setFill(Color.DARKGRAY);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        gc.setStroke(Color.WHITE);
        gc.setLineWidth(2);
        for (int i = 1; i < LANE_COUNT; i++) {
            double x = i * LANE_WIDTH;
            gc.strokeLine(x, 0, x, HEIGHT);
        }

        player.draw(gc);

        for (EnemyCar enemy : enemies) {
            enemy.draw(gc);
        }

        gc.setFill(Color.WHITE);
        gc.setFont(Font.font(24));
        gc.fillText("Score: " + score, 10, 30);
    }

    private void showGameOver() {
        VBox layout = new VBox(20);
        layout.setStyle("-fx-background-color: black; -fx-alignment: center;");
        javafx.scene.text.Text gameOverText = new javafx.scene.text.Text("Game Over");
        gameOverText.setFill(Color.WHITE);
        gameOverText.setFont(Font.font(36));
        javafx.scene.text.Text scoreText = new javafx.scene.text.Text("Your Score: " + score);
        scoreText.setFill(Color.WHITE);
        scoreText.setFont(Font.font(24));
        Button playAgainBtn = new Button("Play Again");
        playAgainBtn.setOnAction(e -> {
            resetGame();
            window.setScene(gameScene);
            gameLoop.start();
        });

        layout.getChildren().addAll(gameOverText, scoreText, playAgainBtn);

        gameOverScene = new Scene(layout, WIDTH, HEIGHT);
        window.setScene(gameOverScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
