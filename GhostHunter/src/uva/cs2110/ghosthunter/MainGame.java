package uva.cs2110.ghosthunter;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;


public class MainGame extends Activity  {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		Changelocation changer = new Changelocation();
		
		setContentView(R.layout.game_main);
		
		changer.execute(R.layout.game_main);
		
		
		
		


	}

	
	
	
//    public void jump(View view)	{
//		yPosition += ySpeed;
//		if (yPosition < 500) { //or whatever the bottom limit is for the screen
//			yPosition += gravity;
//		}
//    }

}

