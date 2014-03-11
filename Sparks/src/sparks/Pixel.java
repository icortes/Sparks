package sparks;

import jgame.GSprite;
import jgame.ImageCache;

public class Pixel extends GSprite {
	public Pixel() {
		super(ImageCache.getImage("pixel.png"));

		PlatformController pc = new PlatformController(
				PlatformControlScheme.WASD, 5, 10);
		this.addController(pc);
	}
}
