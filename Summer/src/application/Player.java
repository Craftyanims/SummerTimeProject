package application;

import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Player extends Rectangle{
	//------------------------------------Initializing the necessary variables------------------------------------------
	private String name;
	private int score;
	private int lives;
	private boolean alive;
	private int speed;
	private int gridX;
	private int gridY;
	private Map map;
	private int tileSize = 39;
	private int playerSize = 19;
	private KeyCode left;
	private KeyCode right;
	private KeyCode up;
	private KeyCode down;
	
	//-----------------------------------------------Constructor--------------------------------------------------------
	/**
	 * Create a Player with a specific name
	 * @param name the player's specified name
	 * @param map the map the player will exist on
	 */
	public Player(String name, Map map) {
		super(5,5,20,20);
		setFill(Color.WHITE);
		setName(name);
		setScore(0);
		setLives(3);
		setAlive(true);
		setSpeed(2);
		setGridX(0);
		setGridY(0);
		this.map = map;
		setLeft(KeyCode.A);
		setRight(KeyCode.D);
		setUp(KeyCode.W);
		setDown(KeyCode.S);
	}
	
	//----------------------------------------------------Methods-------------------------------------------------------
	/**
	 * Returns a boolean to represent whether a player is out of lives
	 * @return true if the player is permanently dead and false otherwise
	 */
	public boolean isPermDead() {
		if(lives == 0) {
			alive = false;
			return true;
		}
		respawn();
		return false;
	}
	
	/**
	 * Returns a boolean to represent whether a player should lose a life
	 * @return true if the player is on the same tile as the enemy
	 */
	public boolean isDead(Enemy enemy) {
		if(enemy.getX() == gridX && enemy.getY() == gridY) {
			loseALife();
			isPermDead();
			return true;
		}
		return false;
	}
	
	/**
	 * Decreases the player's speed by a specified value
	 * @param value the amount the player's speed will decrease by
	 */
	public void slow(int value) {
		setSpeed(speed - value);
	}
	
	/**
	 * Decreases the player's life count by 1
	 */
	public void loseALife() {
		setLives(lives - 1);
	}
	
	/**
	 * Will save the palyer's score
	 */
	public void saveScore() {
	//TODO:	
	}
	
	/**
	 * Checks if player has enough lives left to respawn and resets it values if it can
	 * @return true if respawn is successful and false otherwise
	 */
	public boolean respawn() {		
		if ((lives - 1) > 0) {
			loseALife();
			setGridX(0);
			setGridY(0);
			return true;
		}
		return false;
	}
	
	public void move() {
		setLayoutX(gridX);
		setLayoutY(gridY);
	}
	
	public void update(Enemy enemy) {
		System.out.println("Updating...");
		Tile[][] grid = map.getGrid();
		int nextX;
		int nextY;
		
		if(SpecialKeyboard.checkKey(left)) {
			System.out.println("Trying to move left...");
			if(((gridX - speed)/tileSize) < 0 || gridX - speed < 0) {
				System.out.println("Cannot Move: Out of bounds");
			}else {	
				nextX = gridX - speed;
				System.out.println(nextX);
				Tile nextTile = grid[gridY/tileSize][nextX/tileSize];
				if (nextTile.getID() == "Wall") {
					System.out.println("Cannot Move: There is a wall");
				}else {
					gridX = nextX;
					System.out.println("Successfully moved left");
				}
			}
		}
		
		if(SpecialKeyboard.checkKey(right)) {
			if(((gridX + playerSize + speed)/tileSize) > 9) {
				System.out.println("Cannot Move: Out of bounds");
			}else {	
				nextX = gridX + speed;
				Tile nextTile = grid[(gridY + playerSize)/tileSize][(nextX + playerSize)/tileSize];
				System.out.println("ID is: " + nextTile.getID());
				if (nextTile.getID() == "Wall") {
					System.out.println("Cannot Move: There is a wall");
				}else {
					gridX = nextX;
					System.out.println("Successfully moved right");
				}
			}
		}
		
		if(SpecialKeyboard.checkKey(up)) {
			System.out.println("Trying to move up...");
			if(((gridY - speed)/tileSize) < 0 || gridY < 0) {
				System.out.println("Cannot Move: Out of bounds");
			}else {	
				nextY = gridY - speed;
				Tile nextTile = grid[nextY/tileSize][gridX/tileSize];
				if (nextTile.getID() == "Wall") {
					System.out.println("Cannot Move: There is a wall");
				}else {
					gridY = nextY;
					System.out.println("Successfully moved up");
				}
			}
		}
		
		if(SpecialKeyboard.checkKey(down)) {
			System.out.println("Trying to move down...");
			if(((gridY + playerSize + speed)/tileSize) > 9) {
				System.out.println("Cannot Move: Out of bounds");
			}else {	
				nextY = gridY + speed;
				Tile nextTile = grid[(nextY + playerSize)/tileSize][(gridX + playerSize)/tileSize];
				if (nextTile.getID() == "Wall") {
					System.out.println("Cannot Move: There is a wall");
				}else {
					gridY = nextY;
					System.out.println("Successfully moved down");
				}
			}
		}
		move();
		isDead(enemy);

	}
	
	//-------------------------------------------Getters and Setters----------------------------------------------------
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getScore() {
			return score;
		}
		
		public void setScore(int score) {
			this.score = score;
		}
		
		public int getLives() {
			return lives;
		}
		
		public void setLives(int lives) {
			if(lives >= 0 && lives <= 3) {			
				this.lives = lives;
			}
		}
		
		public boolean isAlive() {
			return alive;
		}

		public void setAlive(boolean alive) {
			this.alive = alive;
		}
		
		public int getSpeed() {
			return speed;
		}
		
		public void setSpeed(int speed) {
			if(speed >= 0) {			
				this.speed = speed;
			}
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
		
		public KeyCode getLeft() {
			return left;
		}
		
		public void setLeft(KeyCode left) {
			this.left = left;
		}
		
		public KeyCode getRight() {
			return right;
		}
		
		public void setRight(KeyCode right) {
			this.right = right;
		}
		
		public KeyCode getUp() {
			return up;
		}
		
		public void setUp(KeyCode up) {
			this.up = up;
		}
		
		public KeyCode getDown() {
			return down;
		}
		
		public void setDown(KeyCode down) {
			this.down = down;
		}

	
	
}
