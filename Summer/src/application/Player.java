package application;

import javafx.scene.input.KeyCode;

public class Player{
	//------------------------------------Initializing the necessary variables------------------------------------------
	private String name;
	private int score;
	private int lives;
	private int speed;
	private int x;
	private int y;
	private Map map;
	private KeyCode left;
	private KeyCode right;
	private KeyCode up;
	private KeyCode down;
	
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
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed >= 0) {			
			this.speed = speed;
		}
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 0 && x <= 10) {
			//if (map.checkTile();)
		}
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//-----------------------------------------------Constructor--------------------------------------------------------
	/**
	 * Create a Player with a specific name
	 * @param name
	 */
	public Player(String name) {
		setName(name);
		setScore(0);
		setLives(3);
		//TODO:speed stuff
		setX(0);
		setY(0);
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
			return true;
		}
		return false;
	}
	
	/**
	 * Returns a boolean to represent whether a player should lose a life
	 * @return true if the player is on the same tile as the enemy
	 */
	public boolean isDead(Enemy enemy) {
		if(enemy.getX() == x && enemy.getY() == y) {
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
		
	}
	
	/**
	 * Checks if player has enough lives left to respawn and resets it values if it can
	 * @return a string indicating if respawn is successful 
	 */
	public String respawn() {		
		if ((lives - 1) > 0) {
			loseALife();
			setX(0);
			setY(0);
			//to annoy jeff by not using boolean
			return "true";
		}
		return "false";
	}
	
	
	
}
