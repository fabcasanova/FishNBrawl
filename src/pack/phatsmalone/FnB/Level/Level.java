package pack.phatsmalone.FnB.Level;

import pack.phatsmalone.FnB.Screen;
import pack.phatsmalone.FnB.Sprite;
import pack.phatsmalone.FnB.Level.tile.Tile;

public class Level {
	
	public int width, height;
	public int[] tiles;
	
	public Level(int width, int height) {
		
		this.width = width;	
		this.height = height;
		tiles = new int[width * height];
		generateLevel();
		
	}

	public Level(String path) {
		
		loadLevel(path);
	}
	
	
	
	private void loadLevel(String path) {}

	private void generateLevel() {}

	public void update() {}
	
	public void time() {}
	//controls corner pins of the screen
	public void render(int xScroll, int yScroll, Screen screen) {
		
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height) >> 4;		
	}
	
	//gets tiles for the level
	public Tile getTile(int x, int y) {
		
		if(tiles[x+y*width] == 0) {
			
			return Tile.grass;
		}
		
		return Tile.voidTile;		
	}
	
	
}
