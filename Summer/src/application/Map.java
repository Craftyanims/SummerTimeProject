package application;

import java.util.ArrayList;

public class Map {
	ArrayList<ArrayList<Tile>> grid = new ArrayList<ArrayList<Tile>>(); //grid of Tiles
	ArrayList<SpeedUp> speedUps = new ArrayList<SpeedUp>(); //List of Tiles with speedUps
	ArrayList<SpeedDown> speedDowns= new ArrayList<SpeedDown>(); //List of Tiles with speedDowns
	Player player; //the player, duh
	//Enemy boss; //the level's boss (only one level so far)
	
	/**
	 * updates the map everytime the player or enemy moves
	 * will call other update functions to check and update data accordingly
	 * 
	 */
	void update() {
		
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
		
	};
	
	/**
	 * activates trap/powerup on tile then calls clear() on tile
	 */
	void triggerTile() {
		
	};
	
	
}
