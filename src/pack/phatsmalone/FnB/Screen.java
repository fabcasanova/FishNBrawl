package pack.phatsmalone.FnB;

import java.util.Random;

import pack.phatsmalone.FnB.Level.tile.Tile;

public class Screen {
	
	public  int width;
	
	public  int height;
	
	public int[] pixels;
	
	private final int MAP_SIZE = 64;
	
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;
	
	public int[] tiles = new int[64*64];
	
	private Random random = new Random();
	
	public Screen(int width, int height) {
		
		this.width = width;																				//Links resolution from maingame class
		this.height = height;
		pixels = new int[width * height];														//array of ints created for each pixel in the game
		
		for (int i = 0; i < (MAP_SIZE *MAP_SIZE); i++) {
			
			tiles[i] = random.nextInt(0xffffff);
			tiles[0] = 0;
		}
		
		}
	
		public void clear() {
			
			for (int i = 0; i < pixels.length; i++) {
				
				pixels[i] = 0;
				
			}
		}
	
		public void render(int xOffset, int yOffset) {     //for demonstrating render(int xOffset, int yOffset)
			
			
			for (int y =  0; y < height; y++ ) {
				int yy = y + yOffset;
				
				//if (yy < 0 || yy >= height)		break;
				
					for (int x = 0; x <width; x++) {
						int xx = x + xOffset;												//scrolls forward through the screen
						
						//if (xx < 0 || xx >= width)		break;
			
						pixels[x+y*width] = Sprite.grass.pixels[(xx & 15)  + (yy & 15) * Sprite.grass.SIZE];
					
					}	
				}
			
		}
		
		
		//renderTile controls offset of tiles and sprites
		public void renderTile(int xp, int yp, Tile tile) {
			
			for(int y = 0; y < tile.sprite.SIZE; y++) {
				int ya = y +yp;
				for(int x = 0; y < tile.sprite.SIZE; x++) {
					int xa = x +xp;
					if(xa< 0 || xa >= width || ya < 0 || ya >= width) {break;}
					pixels[xa + ya + width] = tile.sprite.pixels[x + y *tile.sprite.SIZE];
																}
			}
		}
}
