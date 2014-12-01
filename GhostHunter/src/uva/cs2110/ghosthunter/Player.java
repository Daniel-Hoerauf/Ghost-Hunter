package uva.cs2110.ghosthunter;

import android.content.res.Configuration;
import android.content.res.Resources;

public class Player {
	
	//Need to variable of the shape of player
	
	private float xPos;
	public float yPos;
	public int screenWidth;
	public int screenHeight;
	public float xSpeed;
	public float ySpeed;
	public float gravity;
	
	public Player() {
		xPos = 500;
		yPos = 0;
		gravity = 10;
		screenWidth = MainGame.width;
		screenHeight = MainGame.height;
		xSpeed = screenHeight/4;
		ySpeed = 10;
	}

	
	public void stop() {
		xPos += 0;
		yPos += 0;
		
	}
	
	public void moveRight() {
		if(yPos < (screenWidth - GameView.bitmapWidth - 100))
		yPos += ySpeed;
	}
	
	public void moveLeft() {
		if(yPos > 0)	{
			yPos -= ySpeed;
		}
	}
	
	public void jump() {
		xPos -= xSpeed;
		}
	
	public void shoot() {
		Bullet b = new Bullet(yPos, xPos);
	}


	public float getXPos() {
		if(xPos < (screenHeight - GameView.bitmapHeight - 100))	{
				xPos += gravity;
		}
		return xPos;
	}


	
}
