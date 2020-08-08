package application;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Game extends Scene {
	final public static int WIDTH = 400;
	final public static int HEIGHT = 400;

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
		map = new Map(10,10);
		player = new Player(map,"bob");
		root.getChildren().add(map);
		root.getChildren().add(player);
		//asd
		
	}
	
	private void initAnimationTimer() {
		 at = new AnimationTimer() {
				
				@Override
				public void handle(long arg0) {
					update();
				//	player.update();
//					enemy.update();
					
				}
			};
	}
	
	public void update() {

	}


}
