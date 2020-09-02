package application;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LiveCounter extends HBox{
	private int total;
	public LiveCounter(int amount) {
		total = amount;
		setLayoutY(10);
		setLayoutX(10);
		setSpacing(10);
		for (int i = 0; i < amount; i++) {
			createLifeCounter();
		}
	}
	public void createLifeCounter() {
		Rectangle life = new Rectangle(0,0,10,10);
		life.setFill(Color.RED);
		getChildren().add(life);
	
	}
	
	public void loseLife() {
		if(total > 0) {
			total--;
			getChildren().remove(0);
		}
	}
	
	public void gainLife() {
		total++;
		createLifeCounter();
		
	}
	
	public int getTotal() {
		return total;
	}
	

}
