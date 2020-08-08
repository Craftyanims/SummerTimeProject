package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Map extends Pane {
	private Tile[][] grid;
	private Tile[] speedUps;
	private Tile[] speedDowns;
	private Player player; // the player, duh (not needed?)
	private Enemy enemy; // the level's boss (not needed?)

	// ------------------------Constructors---------------------------

	// Note from Jasmine: Tile [0,0] and Tile [9,9] MUST be no wall

	/**
	 * creates a blank Map Object
	 */
	public Map() {
		grid = new Tile[0][0];
		speedUps = new Tile[0];
		speedDowns = new Tile[0];
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
		initGraphics();
		for (int i = 0; i < maxY; i++) {
			for (int j = 0; j < maxX; j++) {
				grid[i][j] = new Tile("    ", 5 + j*39, 5 + i*39);
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

	public Tile[] getSpeedUps() {
		return speedUps;
	}

	public void setSpeedUps(Tile[] speedUps) {
		this.speedUps = speedUps;
	}

	public Tile[] getSpeedDowns() {
		return speedDowns;
	}

	public void setSpeedDowns(Tile[] speedDowns) {
		this.speedDowns = speedDowns;
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

	public Tile getTile(int x, int y) {
		return grid[x][y];
	}

	public void setTile(String id, int X, int Y, Interaction interaction) {

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
		
		
		
		// Printing map to console (for testing purposes)
		print();

	}

	public void initGraphics() {
		// Making Rectangle for grid (Should take up the whole window)
		// Border
		Rectangle rect = new Rectangle(0, 0, Game.WIDTH, Game.HEIGHT);
		rect.setFill(Color.rgb(0, 0, 0));
		getChildren().add(rect);
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
