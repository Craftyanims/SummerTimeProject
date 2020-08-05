package application;

public class Tile {
	private String ID; //normal, wall, speedUp or speedDown
	private int x; //x position on grid
	private int y; //y position on grid
	private boolean canOverlap = false;
	private SpeedUp powerup; // powerup
	private SpeedDown trap; // trap
	private boolean hasTrap; //does tile have trap on it
	private boolean hasPowerUp; //does tile have powerup on it
	
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
	public String getID() {
		return ID;
	}
	
	public void setID(String id) {
		this.ID = id;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getPos() {
		int[] temp = new int[2];
		temp[0] = x;
		temp[1] = y;
		return temp;
	}
	
	public void setPos (int[] pos) {
		pos[0] = this.x;
		pos[1] = this.y;
	}

	public boolean isHasTrap() {
		return hasTrap;
	}

	public void setHasTrap(boolean hasTrap) {
		this.hasTrap = hasTrap;
	}

	public boolean isHasPowerUp() {
		return hasPowerUp;
	}

	public void setHasPowerUp(boolean hasPowerUp) {
		this.hasPowerUp = hasPowerUp;
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
	
	/**
	 * prints representation of tile for print console
	 * @return
	 */
	
	String print() {
		//return "[" + x + "," + y + "]";
		return "[" + this.ID + "]";
	}
	
}
