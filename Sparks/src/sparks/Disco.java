package sparks;

import jgame.GSprite;
import jgame.ImageCache;

public class Disco extends GSprite {
	public Disco() {
		super(ImageCache.getSequentialImages("disco/disco", 0, 25, ".png"));

		PlatformController pc = new PlatformController(
				PlatformControlScheme.ARROWS_SPACE_FULL, 10, 0, 0);
		this.addController(pc);


	}
}
