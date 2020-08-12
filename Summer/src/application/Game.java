package application;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Game extends Scene {
	final public static int WIDTH = 400;
	final public static int HEIGHT = 400;
	final public static int GRID_X = 10;
	final public static int GRID_Y = 10;

	private AnimationTimer at;
	private Map map;
	private Player player;
	private Enemy enemy;
	private Pane root;

	Game() {
		super(new Pane(), WIDTH, HEIGHT);
		root = (Pane) getRoot();

		initAnimationTimer();

		init();

		at.start();
		SpecialKeyboard.init(this);
	}

	private void init() {
		map = new Map(10, 10);
		player = new Player("bob", map);
		enemy = new Enemy("Jack-e", map);
		root.getChildren().add(map);
		initInteractions();
		root.getChildren().add(player);
		root.getChildren().add(enemy);

		// asd

	}

	private void initInteractions() {
		Interaction[] in = map.getInters();
		root.getChildren().addAll(in);
	}

	private void initAnimationTimer() {
		at = new AnimationTimer() {

			@Override
			public void handle(long arg0) {
				update();

			}
		};
	}

	public void update() {
		player.update(enemy);

	}

}
