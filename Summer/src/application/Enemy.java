package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Enemy extends Rectangle{
	//-------------------------------------Initializing the necessary variables------------------------------------------
	private String name;
	private int speed;
	private int gridX;
	private int gridY;
	private Map map;
	private int tileSize = 39;
	private int enemySize = 20;
	// TODO: path pattern

	//------------------------------------------------Constructor--------------------------------------------------------
	/**
	 * Create a Player with a specific name
	 * 
	 * @param name
	 */
	public Enemy(String name, Map map) {
		super(375,375,20,20);
		setFill(Color.RED);
		setName(name);
		setSpeed(2);
		setGridX((tileSize*10)-enemySize);
		setGridY((tileSize*10)-enemySize);
		this.map = map;
	}
	
	//--------------------------------------------Getters and Setters----------------------------------------------------
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}


		public int getGridX() {
			return gridX;
		}

		public void setGridX(int x) {
			gridX = x;
		}

		public int getGridY() {
			return gridY;
		}

		public void setGridY(int y) {
			gridY = y;
		}
		
		public Map getMap() {
			return map;
		}
		
		public void setMap(Map map) {
			this.map = map;
		}
}
