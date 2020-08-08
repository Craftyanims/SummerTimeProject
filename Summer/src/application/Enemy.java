package application;

import javafx.scene.shape.Rectangle;

public class Enemy extends Rectangle{
	// ------------------------------------Initializing the necessary variables------------------------------------------
	private String name;
	private int speed;
	private int gridX;
	private int gridY;
	private Map map;
	// TODO: path pattern

	// -------------------------------------------Getters and Setters----------------------------------------------------
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
		this.gridX = x;
	}

	public int getGridY() {
		return gridY;
	}

	public void setGridY(int y) {
		this.gridY = y;
	}
	
	public Map getMap() {
		return map;
	}
	
	public void setMap(Map map) {
		this.map = map;
	}

	// -----------------------------------------------Constructor--------------------------------------------------------
	/**
	 * Create a Player with a specific name
	 * 
	 * @param name
	 */
	public Enemy(String name, Map map) {
		setName(name);
		// TODO:speed stuff
		setGridX(0);
		setGridY(0);
		this.map = map;
	}
}
