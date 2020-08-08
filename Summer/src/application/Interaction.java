package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class Interaction extends Rectangle{
	//asdasdasdasdasd
	protected String ID;
	private int value;
	private Tile tile;
	Interaction(Tile tile, int value){
		super(0,0,Game.GRID_X*0.7,Game.GRID_X*0.7);
		setFill(Color.rgb(0,0,255));
		this.tile = tile;
		this.value = value;
	}
	public abstract void update();
	

}
