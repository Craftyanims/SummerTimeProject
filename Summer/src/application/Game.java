package application;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Game extends Scene {

	private AnimationTimer at;
	private Map map;
<<<<<<< HEAD
	private Pane root;
=======
>>>>>>> refs/heads/master
	Game() {
		super(new Pane(), 400, 400);
		root = (Pane) getRoot();
		initAnimationTimer();
		map = new Map(10,10);
<<<<<<< HEAD
		root.getChildren().add(map);
=======
>>>>>>> refs/heads/master
		at.start();
		SpecialKeyboard.init(this);
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

	}


}
