package buildings;

import jgame.GSprite;
import jgame.ImageCache;
import sparks.Solids;

public class Border extends GSprite implements Solids {
	public Border() {
		super(makeBorder());

	}

	private static GSprite makeBorder() {
		GSprite master = new GSprite();
		GSprite left = ImageCache.getSprite("verticalwall.png");
		left.setAnchorTopLeft();
		master.addAt(left, 0, 0);
		return master;
	}
}
