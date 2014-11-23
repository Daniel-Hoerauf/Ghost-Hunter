package uva.cs2110.ghosthunter;

import java.io.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Player {
	
	//Need to variable of the shape of player
	
	public static float xPos = 600;
	public static float yPos = 50;
	public static float xSpeed = 10;
	public static float ySpeed = 10;
	public static float gravity = 5;
	
	public Player() {
		//create instance of a player
	}

	
	public static void stop() {
		xPos += 0;
		yPos += 0;
		
	}
	
	public static void moveRight() {
		xPos += xSpeed;
	}
	
	public static void moveLeft() {
		xPos -= xSpeed;
	}
	
	public static void jump() {
		xPos += xSpeed;
		if (xPos < 600) { //or whatever the bottom limit is for the screen
			xPos -= gravity;
		}
		//may need to implement drag feature
	}
	

	
}
