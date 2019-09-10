package pack.phatsmalone.FnB.Level;

import java.util.Random;

public class RandomLevel extends Level {

	private final Random RANDOM = new Random();
	
	public RandomLevel(int width, int height) {
		super(width, height);
		
	}

	protected void generateLevel() {
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				tiles[x + y* width] = RANDOM.nextInt(4); // random number up to 4
			}
		}
		
		
	}
}
