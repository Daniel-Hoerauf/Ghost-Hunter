package uva.cs2110.ghosthunter;

import java.io.*;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Player {

	// Need to variable of the shape of player

	public float xPos;
	public float yPos;
	public float xSpeed;
	public float ySpeed;
	public float gravity;

	public float drag;
	public int score;
	public boolean collision = false;
	public boolean xPosIncreasing = false;
	public boolean xPosDecreasing = false;
	public boolean yPosIncreasing = false;

	public Player() {
		xPos = 0;
		yPos = 0;
		xSpeed = 50;
		ySpeed = 30;
		gravity = 5;

		drag = 5;
		score = 0;
	}

	public void stop() {
		xPos += 0;
		yPos += 0;

	}

	public void moveRight() {
		yPos += ySpeed;
		if (collision == false) {
			yPos += ySpeed;
			if (yPos > 575) {
				yPos = 575;
			}
			yPosIncreasing = true;
		}
	}

	public void moveLeft() {
		yPos -= ySpeed;
		if (collision == false) {
			yPos -= ySpeed;
			if (yPos < 25) {
				yPos = 25;
			}
			yPosIncreasing = true;
		}
	}

	public void jump() {
		if (collision == false) {
			xPos += xSpeed;
			if (xPos > 0) { // or whatever the bottom limit is for the screen
				xPos -= gravity;
				xPosDecreasing = true;
			}
			xPosIncreasing = true;
		}
		// may need to implement drag feature
	}

	public void shoot() {
		Bullet b = new Bullet(yPos, xPos);
	}

}
