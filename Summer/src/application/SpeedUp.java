package application;

import javafx.scene.paint.Color;

public class SpeedUp extends Interaction{
	private int speedBuff = 15;
	private int duration = 3000;
	SpeedUp(Tile tile){
		super(tile,10);
		setFill(Color.rgb(255,0,0));
	}

	@Override
	public void trigger() {
		// TODO Auto-generated method stub
		
	}

}
