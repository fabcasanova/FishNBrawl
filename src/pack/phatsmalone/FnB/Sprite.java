package pack.phatsmalone.FnB;

public class Sprite {
	
	public final int SIZE;
	public int x,y; 
	public int[] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(16,0,0,SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 0);
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) { //modified constructor
		
		SIZE = size;
		this.x = x* size;
		this.y = y*size;
		this.sheet = sheet;
		pixels = new int[SIZE * SIZE];
		
		load();
		
		
	}
	//creates size and color for voidTiles
	public Sprite(int size, int color) {
		
		SIZE = size;
		pixels = new int[SIZE*SIZE];
		setColor(color);
	}
	//sets color for voidtiles
	private void setColor(int color) {
		for(int i = 0; i < SIZE * SIZE; i++) {
			
			pixels[i] = color;
		}
		
	}

	private  void load() {
		for (int y = 0; y < SIZE; y++) {
			for(int x = 0; x < SIZE; x++) {
			pixels[x + y *SIZE] = sheet.pixels[ (x + this.x) + (y + this.y) * sheet.SIZE];	//finds what sprite is being used
			}
		}
	}
	
}
