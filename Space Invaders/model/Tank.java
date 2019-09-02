package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a tank
 */
public class Tank {
	
	public static final int SIZE_X = 15;
	public static final int SIZE_Y = 8;
	public static final int DX = 2;
	public static final int Y_POS = SIGame.HEIGHT - 40;
	public static final Color COLOR = new Color(250, 128, 20);

	private int x;
	private int y;
	private boolean facingRight;


	// EFFECTS: places tank at position (x, Y_POS) moving right.
	public Tank(int x) {
		this.x = x;
		y = Y_POS;
		facingRight = true;
	}
	
	public int getX() {
		return x;  // stub
	}

    // EFFECTS: returns true if tank is facing right, false otherwise
    public boolean isFacingRight() {
        if (true){
            return true;
        } else {
            return false;
        }
    }

	// MODIFIES: this
	// EFFECTS: tank is facing right
	public void faceRight() {
		facingRight = true;
	}

	// MODIFIES: this
	// EFFECTS: tank is facing left
	public void faceLeft() {
		facingRight = false;
	}

	// MODIFIES: this
	// EFFECTS:  tank is moved DX units in whatever direction it is facing and is
	//           constrained to remain within horizontal bounds of game
    public void move() {
		if (facingRight) {
		    x = x + DX;
        } else {
		    x = x - DX;
        }
		handleBoundary();
	}

	// MODIFIES: this
	// EFFECTS: tank is constrained to remain within horizontal bounds of game
	private void handleBoundary() {
		if (x<0){
		    x = 0;
        } else if (x > SIGame.WIDTH) {
		    x = SIGame.WIDTH;
        }
	}
}
