package application;

import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.paint.Color;

public class SpeedDown extends Interaction{
	private int speedDeBuff = 15;
	private int duration = 3000;
	SpeedDown(Tile tile){
		super(tile,-10);
		setFill(Color.rgb(255,0,255));
	}

	@Override
	public void trigger(Player player) {
		Timer buff = new Timer();
		int temp = player.getSpeed();
		player.setSpeed(temp-speedDeBuff);
		System.out.println("Gotta go slow! " + player.getSpeed());
		
		buff.schedule(new TimerTask() {

			@Override
			public void run() {
				player.setSpeed(temp);
				System.out.println("hold on there buddy " + player.getSpeed());

			}
		}, duration);

	}
	
	

	

}
