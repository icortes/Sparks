package gameviews;

import sparks.Pixel;
import buildings.Floor;
import jgame.GContainer;

public class SparksGameView extends GContainer {
	public SparksGameView() {
		setSize(1280, 720);

		Floor floor = new Floor();
		floor.setAnchorTopLeft();
		this.addAt(floor, 0, 700);

		Pixel px = new Pixel();
		this.addAt(px, 0, 0);
	}
}
