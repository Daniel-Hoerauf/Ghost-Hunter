package uva.cs2110.ghosthunter;

import android.app.Activity;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.widget.Gallery.LayoutParams;
import android.app.*;
import android.support.*;

public class MainGame extends Activity {

	public static float yPosition = 300;
	public static float xPosition = 500;
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
		Paint paint = new Paint();
        paint.setColor(Color.parseColor("#000000"));
		Bitmap bg = BitmapFactory.decodeResource(getResources(), R.drawable.main_player);

		Canvas canvas = new Canvas(bg.copy(Bitmap.Config.ARGB_8888, true));
		canvas.drawBitmap(bg, 50, 300, paint);
		RelativeLayout linlay = (RelativeLayout) findViewById(R.drawable.background);
		linlay.setBackgroundDrawable(new BitmapDrawable(bg));
		
//		mLinearLayout = new LinearLayout(this);
//		ImageView i = new ImageView(this);
//		i.setImageResource(R.drawable.main_player);
//		i.setAdjustViewBounds(true);
//		i.setLayoutParams(new Gallery.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
//
//		mLinearLayout.addView(i);
//		setContentView(mLinearLayout);
	}
	

}

