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
		this.tile = tile;
		this.value = value;
		tile.setInteraction(this);
	}
	public abstract void trigger();
	

}
