package engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Manages keyboard input for the provided screen.
 * 
 * @author <a href="mailto:RobertoIA1987@gmail.com">Roberto Izquierdo Amo</a>
 * 
 */
public class InputManager implements KeyListener {

	private static boolean[] keys = new boolean[256];
	private static InputManager instance = new InputManager();
	
	public static InputManager getInstance() {
		return instance;
	}

	/**
	 * Returns true if the provided key is currently pressed.
	 * 
	 * @param keyCode
	 *            Key number to check.
	 * @return Key state.
	 */
	public static boolean isKeyDown(int keyCode) {
		return keys[keyCode];
	}

	/**
	 * Changes the state of the key to pressed.
	 */
	@Override
	public void keyPressed(KeyEvent key) {
		keys[key.getKeyCode()] = true;
	}

	/**
	 * Changes the state of the key to not pressed.
	 */
	@Override
	public void keyReleased(KeyEvent key) {
		keys[key.getKeyCode()] = false;
	}

	/**
	 * Does nothing.
	 */
	@Override
	public void keyTyped(KeyEvent key) {

	}
}