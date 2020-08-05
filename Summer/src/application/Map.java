package application;

import java.util.ArrayList;

public class Map {
	private Tile[][] grid;
	private Tile[] speedUps;
	private Tile[] speedDowns;
	private Player player; //the player, duh
	private Enemy enemy; //the level's boss
	
	//------------------------Constructors---------------------------
	
	/**
	 * creates a blank Map Object
	 */
	Map() {
		grid = new Tile[0][0];
		speedUps = new Tile[0];
		speedDowns = new Tile[0];
	};
	
	/**
	 * creates an empty map of specified size with no walls
	 * @param maxX: how wide the map is
	 * @param maxY: how tall the map is
	 */
	Map(int maxX, int maxY) {
		grid = new Tile[maxX][maxY];
		for (int i = 0; i < maxY; i++) {
			for (int j = 0; j < maxX; j++) {
					grid[i][j] = new Tile("    ", i, j);
			}
		}
	};
	
	//------------------------Getters and Setters---------------------
	
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
	
	//------------------------Other Functions-------------------------
	
	/**
	 * updates the map everytime the player or enemy moves
	 * will call other update functions to check and update data accordingly
	 * 
	 */
	void update() {
		
		// first check tile for overlap
		checkTile();
		
		//if player goes on tile with trap or powerup then update player speed accordingly
		updateTrap();
		updatePowerUp();
		
	};
	

	/**
	 * updates the players speed (down)
	 */
	void updateTrap() {
		
	};
	
	/**
	 * updates the players speed (up)
	 */
	void updatePowerUp() {
		
	};
	
	/**
	 * checks whether player can move on the tile (cannot move on same tile as enemy)
	 */
	void checkTile() {
		
		//if tile has trap/powerup then trigger tile
		//triggerTile();
		
	};
	
	/**
	 * activates trap/powerup on tile then calls clear() on tile
	 */
	void triggerTile(Tile tile) {
		
		tile.clear();
		
	};
	
	/**
	 * generates walls for level one then prints out to console
	 */
	
	void levelOne() {
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
		
		print();
	}
	
	
	/**
	 * prints map to console
	 */
	
	void print() {
		
		for (int i = 0; i < grid.length; i++) {
			System.out.println();
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j].print() + " ");
			}
		}
		
	}
	
	
	
}
