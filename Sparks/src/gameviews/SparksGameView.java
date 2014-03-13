package gameviews;

import jgame.GContainer;
import sparks.Disco;
import buildings.Border;

public class SparksGameView extends GContainer {
	public SparksGameView() {
		setSize(1280, 720);

		Border br = new Border();
		this.addAt(br, 0, 0);

		Disco ds = new Disco();
		this.addAtCenter(ds);
	}
}
