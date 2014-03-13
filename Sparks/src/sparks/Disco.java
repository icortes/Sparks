package sparks;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ParentBoundsListener;

public class Disco extends GSprite {
	public Disco() {
		super(ImageCache.getSequentialImages("disco/disco", 0, 25, ".png"));

		PlatformController pc = new PlatformController(
				PlatformControlScheme.ARROWS_SPACE_FULL, 10, 0, 0);
		this.addController(pc);

		ParentBoundsListener limiter = new ParentBoundsListener() {

			@Override
			public void invoke(GObject target, Context context) {
				double parentHeight = getParent().getHeight();
				double parentWidth = getParent().getWidth();
				double y = getY();
				double x = getX();
				double h = getHeight() * getScaleY();
				double w = getWidth() * getScaleX();
				if (y > parentHeight / 2) {
					setY(parentHeight - h / 2);
				} else {
					setY(h / 2);
				}
				if (x > parentWidth / 2) {
					setX(parentWidth - w / 2);
				} else {
					setX(w / 2);
				}
			}
		};
		addListener(limiter);
	}
}
