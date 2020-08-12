package application;

import java.util.ArrayList;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Map extends Pane {
	private Tile[][] grid;
	private Interaction[] inters;
	private Tile playerSpawn;
	private Tile enemySpawn;
	public static int tileSize;
	private Player player; // the player, duh (not needed?)
	private Enemy enemy; // the level's boss (not needed?)

	// ------------------------Constructors---------------------------

	// Note from Jasmine: Tile [0,0] and Tile [9,9] MUST be no wall

	/**
	 * creates a blank Map Object
	 */
	public Map() {
		grid = new Tile[0][0];
	};

	/**
	 * creates an empty map of specified size with no walls
	 * 
	 * @param maxX: how wide the map is
	 * @param maxY: how tall the map is
	 */
	public Map(int maxX, int maxY) {
		
		grid = new Tile[maxX][maxY];
		//to make RECTANGLES
		tileSize = 39;
		initGraphics();
		for (int i = 0; i < maxY; i++) {
			for (int j = 0; j < maxX; j++) {
				grid[i][j] = new Tile("    ", 5 + j*tileSize, 5 + i*tileSize);
				getChildren().add(grid[i][j]);
			}
		}

		levelOne();
	};

	// ------------------------Getters and Setters---------------------

	public Tile[][] getGrid() {
		return grid;
	}

	public void setGrid(Tile[][] grid) {
		this.grid = grid;
	}

	public Interaction[] getInters() {
		return inters;
	}

	public void setInters(Interaction[] inters) {
		this.inters = inters;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

	public Tile getTile(int X, int Y) {
		return grid[Y][X];
	}

	public void setTile(String id, int X, int Y, Interaction interaction) {
		grid[Y][X].setID(id);
		grid[Y][X].setInteraction(interaction);
	}
	
	public Tile getPlayerSpawn() {
		return playerSpawn;
	}
	
	public void setPlayerSpawn(Tile playerSpawn) {
		this.playerSpawn = playerSpawn;
	}
	
	public Tile getEnemySpawn() {
		return enemySpawn;
	}
	
	public void setEnemySpawn(Tile enemySpawn) {
		this.enemySpawn = enemySpawn;
	}
	
	
	

	// ------------------------Other Functions-------------------------


	/**
	 * updates the map everytime the player or enemy moves will call other update
	 * functions to check and update data accordingly
	 * 
	 */
	public void update() {

		// first check tile for overlap
		checkTile();

		// if player goes on tile with trap or powerup then update player speed
		// accordingly
		updateTrap();
		updatePowerUp();

	};

	/**
	 * updates the players speed (down)
	 */
	public void updateTrap() {

	};

	/**
	 * updates the players speed (up)
	 */
	public void updatePowerUp() {

	};

	/**
	 * checks whether player can move on the tile (cannot move on same tile as
	 * enemy)
	 */
	public void checkTile() {

		// if tile has trap/powerup then trigger tile
		// triggerTile();

	};

	/**
	 * activates trap/powerup on tile then calls clear() on tile
	 */
	public void triggerTile(Tile tile) {
		tile.clear();

	};

	/**
	 * generates walls for level one then prints out to console
	 */

	public void levelOne() { // TODO: create a list of coords
		// Making "Wall" Tiles
		//ArrayList<Integer[]> wallCoords = new ArrayList<Integer[]>();
		//wallCoords.add(new Integer[1]);
		 
		grid[0][5].setID("Wall");
		grid[0][6].setID("Wall");
		grid[1][1].setID("Wall");
		grid[1][2].setID("Wall");
		grid[1][3].setID("Wall");
		grid[1][8].setID("Wall");
		grid[2][3].setID("Wall");
		grid[2][5].setID("Wall");
		grid[2][7].setID("Wall");
		grid[2][8].setID("Wall");
		grid[3][1].setID("Wall");
		grid[3][5].setID("Wall");
		grid[3][7].setID("Wall");
		grid[4][1].setID("Wall");
		grid[4][2].setID("Wall");
		grid[4][3].setID("Wall");
		grid[4][5].setID("Wall");
		grid[4][7].setID("Wall");
		grid[4][9].setID("Wall");
		grid[5][3].setID("Wall");
		grid[5][7].setID("Wall");
		grid[5][9].setID("Wall");
		grid[6][1].setID("Wall");
		grid[6][3].setID("Wall");
		grid[6][4].setID("Wall");
		grid[6][5].setID("Wall");
		grid[6][6].setID("Wall");
		grid[6][7].setID("Wall");
		grid[6][9].setID("Wall");
		grid[7][1].setID("Wall");
		grid[8][1].setID("Wall");
		grid[8][2].setID("Wall");
		grid[8][3].setID("Wall");
		grid[8][5].setID("Wall");
		grid[8][6].setID("Wall");
		grid[8][7].setID("Wall");
		grid[8][8].setID("Wall");
		
		//set Spawn tile
		playerSpawn = grid[0][0];
		grid[0][0].setID("Spawn");
		
		//Creating interactions
		inters = new Interaction[2]; //one for speedup and one for speeddown
		inters[0] = new SpeedUp(grid[9][0]);
		inters[1] = new SpeedDown(grid[0][9]);
		
		// Printing map to console (for testing purposes)
		//print();

	}
	
	public void setWalls(int[][] coord) {
		for (int i = 0; i < coord.length; i++) {
			for (int j = 0; j < coord[0].length; j++) {
				grid[i][j].setID("Wall");
			}
		}
		
	}

	public void initGraphics() {
		// Making Rectangle for grid (Should take up the whole window)
		// Border
		Rectangle border = new Rectangle(0, 0, Game.WIDTH, Game.HEIGHT);
		border.setFill(Color.rgb(0, 0, 0)); //set to black
		getChildren().add(border);
	}

	/**
	 * prints map to console
	 */

	public void print() {

		for (int i = 0; i < grid.length; i++) {
			System.out.println();
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j].print() + " ");
			}
		}

	}

}
