package uva.cs2110.ghosthunter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainGame extends Activity{

	
	public static float yPosition = 300;
	public static float xPosition = 500;
	Player character = new Player();
	//want to place this instance of a player somewhere specific on the main game activity screen
	//then I want to update his position on the screen everytime it needs to (pulls from player, which pulls from sensor activity)

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);
    }
	
	



	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.game_main);
	}

}

