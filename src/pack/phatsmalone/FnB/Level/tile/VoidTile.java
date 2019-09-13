package pack.phatsmalone.FnB.Level.tile;

import pack.phatsmalone.FnB.Screen;
import pack.phatsmalone.FnB.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);
		
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x, y, this);
		//do rendering stuff here, render is in every tile class 
	}
}
