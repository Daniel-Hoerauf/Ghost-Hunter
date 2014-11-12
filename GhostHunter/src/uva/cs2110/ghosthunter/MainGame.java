package uva.cs2110.ghosthunter;

import android.app.Activity;
import android.os.Bundle;

public class MainGame extends Activity{
	
	public double yPosition;
	public double xPosition;
	public double ySpeed = 0;
	public double xSpeed = 0;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);
    }
	
	
}
