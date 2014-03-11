package buildings;

import jgame.GSprite;
import jgame.ImageCache;
import sparks.SolidGround;

public class Floor extends GSprite implements SolidGround {

	public Floor() {
		super(ImageCache.getImage("floorbase.png"));
	}

}
