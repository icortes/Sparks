package buildings;

import java.awt.Color;

import jgame.GSprite;
import jgame.ImageCache;
import sparks.Solids;

public class Border extends GSprite implements Solids {
	public Color color;

	public Border() {
		makeBorder();
		this.color = Color.MAGENTA;

	}

	private void makeBorder() {
		GSprite g = ImageCache.getSprite("verticalwall.png");
		addAt(g, 10, 0);
	}
}
