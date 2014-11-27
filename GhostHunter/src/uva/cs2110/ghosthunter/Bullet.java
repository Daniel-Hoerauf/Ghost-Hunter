package uva.cs2110.ghosthunter;

import java.util.ArrayList;

public class Bullet implements Projectile {

	float x, y, speedX;
	boolean visible;

	public Bullet(float yPos, float xPos) {
		x = yPos;
		y = xPos;
		speedX = 10;
		visible = true;
	}

	public float getSpeedX() {
		return speedX;
	}

	
	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	
	public boolean isVisible() {
		return visible;
	}

	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	
	public void setX(int x) {
		this.x = x;
	}

	
	public void setY(int y) {
		this.y = y;
	}

	
	@Override
	public float getX() {
		return x;

	}

	@Override
	public float getY() {
		return y;

	}
	

	@Override
	public void updateX() {
		x += speedX;
		if (x > 800) { // whatever the right bound of the sceeen is
			visible = false; // best to remove the bullet all together
		}

	}

	@Override
	public void hit() {
		// TODO Auto-generated method stub

	}

}
