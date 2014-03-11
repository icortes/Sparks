package sparks;

import gameviews.SparksGameView;

import java.awt.Color;

import jgame.GRootContainer;
import jgame.Game;
import jgame.ImageCache;

public class Sparks extends Game {

	public Sparks() {
		GRootContainer root = new GRootContainer(Color.BLACK);
		setRootContainer(root);
		SparksGameView sgv = new SparksGameView();
		root.addView(Views.GAME, sgv);
	}

	public enum Views {
		// These are all of the views for this game
		MENU, GAME, GAME_OVER, INSTRUCTIONS, OTHER;
	}

	public static void main(String[] args) {
		ImageCache.create(Sparks.class, "/sparks/rsc/");
		Sparks f = new Sparks();
		f.startGame("Sparks");
	}

}
