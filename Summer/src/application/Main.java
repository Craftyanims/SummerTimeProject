package application;
	
import java.util.Timer;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private AnimationTimer at = new AnimationTimer() {
		
		@Override
		public void handle(long arg0) {
			update();
			
		}
	};
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			SpecialKeyboard.init(scene);
			at.start();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {

		
	}
	

	
	public static void main(String[] args) {
		launch(args);
	}
}
