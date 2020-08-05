package application;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;

public class Game extends Scene {

	private AnimationTimer at;
	Game() {
		super(new BorderPane(), 400, 400);
		initAnimationTimer();
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
