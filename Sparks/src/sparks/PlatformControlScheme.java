package sparks;

import java.awt.event.KeyEvent;

public final class PlatformControlScheme {

	/**
	 * The control scheme using the arrow keys and space for jump.
	 */
	public static PlatformControlScheme ARROWS_SPACE = new PlatformControlScheme(
			KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, KeyEvent.VK_SPACE);

	/**
	 * The control scheme using the arrow keys and space for jump.
	 */
	public static PlatformControlScheme ARROWS_SPACE_FULL = new PlatformControlScheme(
			KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, KeyEvent.VK_UP,
			KeyEvent.VK_DOWN, KeyEvent.VK_SPACE);

	/**
	 * The control scheme using the A and D keys, and space for jump.
	 */
	public static PlatformControlScheme WASD = new PlatformControlScheme(
			KeyEvent.VK_A, KeyEvent.VK_D, KeyEvent.VK_W);

	/**
	 * The key code for leftward movement.
	 */
	public final int lt;

	/**
	 * The key code for rightward movement.
	 */
	public final int rt;

	/**
	 * The key code for upward movement.
	 */
	public final int uw;

	/**
	 * The key code downward movement.
	 */
	public final int dw;

	/**
	 * The key code for jumping.
	 */
	public final int jump;

	/**
	 * Creates the control scheme with the given parameters.
	 * 
	 * @param lt
	 *            the key code for leftward movement
	 * @param rt
	 *            the key code for rightward movement
	 * @param jump
	 *            the key code for jumping
	 */
	public PlatformControlScheme(int lt, int rt, int jump) {
		this.lt = lt;
		this.rt = rt;
		this.dw = 0;
		this.uw = 0;
		this.jump = jump;
	}

	/**
	 * Creates the control scheme with the given parameters.
	 * 
	 * @param lt
	 *            the key code for leftward movement
	 * @param rt
	 *            the key code for rightward movement
	 * @param jump
	 *            the key code for jumping
	 */
	public PlatformControlScheme(int lt, int rt, int uw, int dw, int jump) {
		this.lt = lt;
		this.rt = rt;
		this.uw = uw;
		this.dw = dw;
		this.jump = jump;
	}
}
