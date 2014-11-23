package uva.cs2110.ghosthunter;

import java.io.*;
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
	
	public Player() {
		xPos = 600;
		yPos = 50;
		xSpeed = 10;
		ySpeed = 10;
		gravity = 5;
	}

	
	public void stop() {
		xPos += 0;
		yPos += 0;
		
	}
	
	public void moveRight() {
		yPos += ySpeed;
	}
	
	public void moveLeft() {
		yPos -= ySpeed;
	}
	
	public void jump() {
		xPos += xSpeed;
		if (xPos < 600) { //or whatever the bottom limit is for the screen
			xPos -= gravity;
		}
		//may need to implement drag feature
	}
	

	
}
