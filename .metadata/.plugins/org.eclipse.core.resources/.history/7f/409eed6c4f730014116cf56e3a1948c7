package uva.cs2110.ghosthunter;

import android.app.Activity;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.widget.Gallery.LayoutParams;
import android.app.*;
import android.content.Intent;
import android.support.*;

public class MainGame extends Activity  {

	public static float yPosition = Player.yPos;
	public static float xPosition = Player.xPos;
	public static float ySpeed = 10;
	public static float gravity = 5;
	private Player character = new Player();


	LinearLayout mLinearLayout;
	//want to place this instance of a player somewhere specific on the main game activity screen
	//then I want to update his position on the screen everytime it needs to (pulls from player, which pulls from sensor activity)



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.game_main);
		//where to change position
		/*Paint paint = new Paint();
        paint.setColor(Color.parseColor("#000000"));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
		Bitmap bg = BitmapFactory.decodeResource(getResources(), R.drawable.main_player, options);

		Canvas canvas = new Canvas(bg);
		canvas.drawBitmap(bg, yPosition, xPosition, paint); //x and y, so think of it as y and x because horizontal
		*/
	}
	
	//protected void onDraw(Canvas canvas) {
		//canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.main_player), 10, 10, null);
	//}
	
	
    public void jump(View view)	{
		yPosition += ySpeed;
		if (yPosition < 500) { //or whatever the bottom limit is for the screen
			yPosition += gravity;
		}
    }

}

