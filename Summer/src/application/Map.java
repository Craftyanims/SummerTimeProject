package application;

import java.util.ArrayList;

public class Map {
	ArrayList<ArrayList<Tile>> grid = new ArrayList<ArrayList<Tile>>(); //grid of Tiles
	ArrayList<SpeedUp> speedUps = new ArrayList<SpeedUp>(); //List of Tiles with speedUps
	ArrayList<SpeedDown> speedDowns= new ArrayList<SpeedDown>(); //List of Tiles with speedDowns
	Player player; //the player, duh
	//Enemy boss; //the level's boss (only one level so far)
	
	//------------------------Constructors---------------------------
	
	/**
	 * creates a blank Map Object
	 */
	Map() {
		grid.add(new ArrayList<Tile>());
		grid.get(0).set(0, new Tile());
	};
	
	/**
	 * creates an empty map of specified size with empty Tiles
	 * @param maxX: how wide the map is
	 * @param maxY: how tall the map is
	 */
	Map(int maxX, int maxY) {
		
		for (int i = 0; i  < maxY; i++) {
			grid.add(new ArrayList<Tile>());
		}
		
		for (int i = 0; i < maxY; i++) {
			for (int j = 0; j < maxX; j++) {
				grid.get(i).set(j, new Tile());
			}
		}
		
	};
	
	//------------------------Getters and Setters---------------------
	
	
	
	
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
	
	
}
