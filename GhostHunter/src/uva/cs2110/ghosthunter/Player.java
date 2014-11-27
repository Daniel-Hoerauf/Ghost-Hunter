package uva.cs2110.ghosthunter;

import java.io.*;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Player {
	
	//Need to variable of the shape of player
	
	public float xPos;
	public float yPos;
	public float xSpeed;
	public float ySpeed;
	public float gravity;
	public int score;
	
	public Player() {
		xPos = 0;
		yPos = 0;
		xSpeed = 10;
		ySpeed = 10;
		gravity = 5;
		score = 0;
	}

	
	public void stop() {
		xPos += 0;
		yPos += 0;
		
	}
	
	public void moveRight() {
		yPos += ySpeed;
		if (yPos > 575) {
			yPos = 575;
		}
	}
	
	public void moveLeft() {
		yPos -= ySpeed;
		if (yPos < 25) {
			yPos = 25;
		}
	}
	
	public void jump() {
		xPos -= xSpeed;
		if (xPos < 600) { //or whatever the bottom limit is for the screen
			xPos -= gravity;
		}
		//may need to implement drag feature
	}
	

	
}
