package uva.cs2110.ghosthunter;

import java.io.*;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Player {

	// Need to variable of the shape of player

	public int xPos;
	private int yPos;
	public int xSpeed;
	public int ySpeed;
	public int gravity;

	private int screenWidth;
	private int screenHeight;

	public int drag;
	public int score;
	public boolean collision = false;
	public boolean xPosIncreasing = false;
	public boolean xPosDecreasing = false;
	public boolean yPosIncreasing = false;

	public Player() {
		yPos = 500;
		xPos = 0;
		gravity = 25;
		screenWidth = MainGame.width;
		screenHeight = MainGame.height;
		ySpeed = screenHeight/4;
		xSpeed = 10;
	}

	public void stop() {
		xPos += 0;
		yPos += 0;

	}

	public void moveRight() {
		if(xPos < (screenWidth - GameView.bitmapWidth - 100))
			xPos += xSpeed;
	}

	public void moveLeft() {
		if(xPos > 0) {
			xPos -= xSpeed;
		}
	}

	public void jump() {
		yPos -= ySpeed;
	}

	public void shoot() {
		Bullet b = new Bullet(xPos, yPos);
		b.updateX();
	}

	protected int getYPos() {
		if(yPos < (screenHeight - GameView.bitmapHeight - 100)) {
			yPos += gravity;
		}
		return yPos;
	}

}
