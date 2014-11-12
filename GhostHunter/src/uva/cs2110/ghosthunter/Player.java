package uva.cs2110.ghosthunter;

import java.awt.*;

public class Player {
	private int positionX;
	private int positionY;
	private boolean jumped = false;
	
	private int velocityX;
	private int velocityY;

	
	
	public void update() {
		float x = SensorActivity.getY();
		if (x > 0) {
			positionX += speedX;
		} else {
			positionX -= speedX;
		}
			
		if (positionX + SensorActivity.getY() >= 300) {
			positionX = 300;
		}
		else {
			positionX += speedX;
		}
	}

	public void updateX() {
		
	}
	
	
}
