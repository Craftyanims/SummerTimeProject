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
	private Interaction inters[];

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
		int level1[][] = 
					  {{2,0,0,0,0,1,1,0,0,4},
		              {0,1,1,1,0,0,0,0,1,0},
		              {0,0,0,1,0,1,0,1,1,0},
		              {0,1,0,0,0,1,0,1,0,0},
		              {0,1,1,1,0,1,0,1,0,1},
		              {0,0,0,1,0,0,0,1,0,1},
		              {0,1,0,1,1,1,1,1,0,1},
		              {0,1,0,0,0,0,0,0,0,0},
		              {0,1,1,1,0,1,1,1,1,0},
		              {5,0,0,0,0,0,0,0,0,3}};
		
		player = new Player("bob", map);
		enemy = new Enemy("Jack-e", map);
		root.getChildren().add(map);
		initInteractions();
		root.getChildren().add(player);
		root.getChildren().add(enemy);



	}

	private void initInteractions() {
//		inters = map.getInters();
	//	root.getChildren().addAll(inters);
	}

	private void initAnimationTimer() {
		at = new AnimationTimer() {

			@Override
			public void handle(long arg0) {
				update();

			}
		};
	}
	
	private void checkInteractions() {
		int size = Map.tileSize;
		int gridX = (int)player.getX()%size;
		int gridY = (int)player.getY()%size;
		for (Interaction i : inters) {
			int tileX = (int)i.getX()%size;
			int tileY = (int)i.getY()%size;
			if(tileX == gridX && tileY == gridY) {
				i.trigger(player);
			}
		}
	}

	public void update() {
		player.update(enemy);
		checkInteractions();
		

	}

}
