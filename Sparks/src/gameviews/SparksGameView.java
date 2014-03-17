package gameviews;

import java.util.List;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.listener.FrameListener;
import pixels.BluePixel;
import pixels.Pixel;
import sparks.Disco;
import buildings.Border;

public class SparksGameView extends GContainer {
	public SparksGameView() {
		setSize(1280, 720);

		Border br = new Border();
		this.addAt(br, 2, 0);

		final Disco ds = new Disco();
		this.addAtCenter(ds);

		final Pixel p = new BluePixel();
		addAt(p, 10, 500);

		FrameListener fl = new FrameListener() {

			@Override
			public void invoke(GObject target, Context context) {
				addAt(new BluePixel(), 100, 200);
				List<Pixel> px = context.getInstancesOfClass(Pixel.class);
				for (Pixel p : px) {
					p.moveAtAngle(p.distanceTo(ds), 30);
					/* p.moveToward(Math.sin(p.distanceTo(ds)), ds); */
					// System.out.println(p.distanceTo(ds));
				}
			}
		};
		addListener(fl);

	}
}
