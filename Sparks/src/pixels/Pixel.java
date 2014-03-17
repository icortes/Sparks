package pixels;

import java.awt.Image;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.listener.HitTestListener;
import sparks.Disco;
import sparks.Solids;

public class Pixel extends GSprite implements Solids {
	public Pixel(Image image) {
		super(image);
		this.addListener(new HitTestListener(Disco.class) {
			
			@Override
			public void invoke(GObject target, Context context) {
				target.removeSelf();
			}
		});
	}

}
