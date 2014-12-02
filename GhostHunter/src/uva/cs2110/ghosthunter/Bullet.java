package uva.cs2110.ghosthunter;

import java.util.ArrayList;

import android.util.Log;

public class Bullet implements Projectile {

	protected static boolean moveForward;
	int x, y, speedX;
	boolean visible;
	public boolean isShot;

	public Bullet(int yPos, int xPos) {
		x = yPos;
		y = xPos;
		speedX = 50;
		visible = true;
		isShot = false;
	}

	public int getSpeedX() {
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
	public int getX() {
		return x;

	}
	
	public void setShot(boolean val){
		isShot = val;
	}
	
	public boolean isShot(){
		return isShot;
	}

	@Override
	public int getY() {
		return y;

	}

	@Override
	public void updateX() {
		if(moveForward)	{
			x += speedX;
		}
		else	{
			x -= speedX;
		}
		if (x > 800 || x < 0) { // whatever the right bound of the sceeen is
			visible = false; // best to remove the bullet all together
		}
		Log.d("shot", Integer.toString(x));

	}

	@Override
	public void hit() {
		// TODO Auto-generated method stub

	}

}
