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

	//------------------------------------------------Constructors--------------------------------------------------------
	/**
	 * Create an Enemy with a specific name
	 * 
	 * @param name 
	 * @param map 
	 */
	public Enemy(String name, Map map) {
		super(375,375,20,20);
		//setWidth
		//setHeight
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
		
	//--------------------------------------------Other Functions----------------------------------------------------
		
		public void update() {
			move();
			
			//to add: things to change
			//change x and y coords
			//moving in a fixed route
			//attacking (later thing)
			
		}
		
		public void increaseSpeed() {
			
		}
		
		public void decreaseSpeed() {
			
		}
		
		public void move() {
			Tile[][] grid = map.getGrid();
			Tile nextTileTL;
			Tile nextTileTR;
			Tile nextTileBL;
			Tile nextTileBR;
			int nextX;
			int nextY;
			
			//first check if enemy can move left
			System.out.println("Trying to move Enemy left...");
			nextX = gridX - speed;
			if(((nextX)/tileSize) < 0 || nextX < 0) {
				System.out.println("Cannot Move Enemy: Out of bounds");
			} else {
				System.out.println("(gridY + enemySize)/tileSize is:" + (gridY - enemySize)/tileSize + " and nextX/tileSize is: " + 
						nextX/tileSize);
				nextTileTL = grid[gridY/tileSize][nextX/tileSize];
				nextTileTR = grid[gridY/tileSize][(nextX - enemySize)/tileSize];
				nextTileBL = grid[(gridY - enemySize)/tileSize][nextX/tileSize];
				//TODO: figure out why index is not 9 (adding enemySize gets 10 and subtracting enemySize gets 8?)
				nextTileBR = grid[(gridY - enemySize)/tileSize][(nextX - enemySize)/tileSize];
				if (nextTileTL.getID() == "Wall" || nextTileTR.getID() == "Wall" || nextTileBL.getID() == "Wall" || nextTileBR.getID() == "Wall") {
					System.out.println("Cannot Move Enemy: There is a wall");
				} else {
					gridX = nextX;
					System.out.println("Successfully moved Enemy left");
				}
			}
			
			setLayoutX(gridX);
			setLayoutY(gridY);
			
		}
		
		
		
}
