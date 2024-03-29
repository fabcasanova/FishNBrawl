package pack.phatsmalone.FnB;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

		public String path;
		public final int SIZE;
		public int[] pixels;
		
		public static SpriteSheet tiles =  new SpriteSheet("/textures/spritesheet.png", 256);
		
		public SpriteSheet(String path, int size) { //modified constructor
			
			this.path = path;
			this.SIZE = size;
			
			pixels = new int [SIZE *SIZE];
			load();
			
		}
		
	private void load() {
		
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path)); //captures path of intended sprite
			
			int w = image.getWidth();
			int h = image.getHeight();

			image.getRGB(0,0, w, h, pixels , 0, w);
			
			
		} catch (IOException e) {
			e.printStackTrace();
			}	
		
	}
	
	
	
	
}
