package pack.phatsmalone.FnB.Level;

import pack.phatsmalone.FnB.Screen;

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
	
	public void render(int xScroll, int yScroll, Screen screen) {
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height) >> 4;
		
	}
	
	
	
}
