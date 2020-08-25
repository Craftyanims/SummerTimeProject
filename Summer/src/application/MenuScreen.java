package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuScreen {
	/**
	 * Creates the initial screen users see with the option to start the game
	 * 
	 * @param stage Is the main window that displays the information
	 */
	public MenuScreen(Stage stage) {
		Scene startMenu;
		Label title = new Label("Definitely Not Pac-Man");

		// creates all the buttons players can choose from
		Button startButton = new Button("Start New Game");
		Button aboutButton = new Button("About");
		Button closeGameButton = new Button("Exit Game");

		startButton.setPrefHeight(51);
		startButton.setPrefWidth(225);
		//startButton.setOnAction(e -> new SetUpScreen(stage));

		aboutButton.setPrefHeight(51);
		aboutButton.setPrefWidth(225);
		//aboutButton.setOnAction(e -> new AboutScreen(stage));

		closeGameButton.setPrefHeight(51);
		closeGameButton.setPrefWidth(225);
		closeGameButton.setOnAction(e -> stage.close());

		VBox layout = new VBox(4);
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().addAll(title, startButton, aboutButton, closeGameButton);
		startMenu = new Scene(layout, 700, 500);

		stage.setScene(startMenu);
	}
}
