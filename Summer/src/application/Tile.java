package application;

public class Tile {
	String ID; //normal, speedUp or speedDown
	int x; //x position on grid
	int y; //y position on grid
	boolean canOverlap = false;
	SpeedUp powerup; // powerup
	SpeedDown trap; // trap
	boolean hasTrap; //does tile have trap on it
	boolean hasPowerUp; //does tile have powerup on it
	
	//------------------------Constructors---------------------------
	/**
	 * creates a blank Tile object
	 */
	Tile() {
		ID = "";
		x = 0;
		y= 0;
		hasTrap = false;
		hasPowerUp = false;
	}
	
	/**
	 * creates a normal Tile object
	 * @param id: tile is blank 
	 * @param X: x position on the grid
	 * @param Y: y position on the grid
	 */
	Tile(String id, int X, int Y) {
		ID = id;
		x = X;
		y= Y;
		hasTrap = false;
		hasPowerUp = false;
	}
	
	/**
	 * creates a Tile object with powerup
	 * @param id: tile has powerup
	 * @param X: x position on the grid
	 * @param Y: y position on the grid
	 * @param speedup: the powerup on the Tile
	 */
	Tile(String id, int X, int Y, SpeedUp speedup) {
		ID = id;
		x = X;
		y= Y;
		hasTrap = false;
		hasPowerUp = true;
		powerup = speedup;
	}
	
	/**
	 * creates a Tile object with trap
	 * @param id: tile has trap
	 * @param X: x position on the grid
	 * @param Y: y position on the grid
	 * @param speed_down: the trap on the tile
	 */
	Tile(String id, int X, int Y, SpeedDown speed_down) {
		ID = id;
		x = X;
		y= Y;
		hasTrap = true;
		hasPowerUp = false;
		trap = speed_down;
	}
	
	//------------------------Getters and Setters---------------------
	
	public void getID(String id) {
		id = ID;
	}
	
	public void getPos(int X, int Y) {
		X = x;
		Y = y;
	}
	
	public void getEvent(boolean activeTrap, boolean activePowerUp) {
		activeTrap = hasTrap;
		activePowerUp = hasPowerUp;
	}
	
	//------------------------Other Functions-------------------------
	
	/**
	 * clears the trap/powerup from the tile
	 */
	void clear() {
		SpeedUp powerup;
		SpeedDown trap;
		boolean hasTrap = false;
		boolean hasPowerUp = false;
	};
	
}
