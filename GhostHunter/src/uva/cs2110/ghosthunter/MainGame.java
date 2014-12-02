package uva.cs2110.ghosthunter;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;

public class MainGame extends Activity {

	Button moveLeft;
	Button moveRight;
	Button jump;
	Button shoot;
	Button shoot2;
	Button shield;
	
	//public static boolean shot = false;
	protected static int width;
	protected static int height;
	
	private TextView textview;
	protected static boolean inForeground;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Display display = getWindowManager().getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		width = size.x;
		height = size.y;
		// Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.game_main);

		moveLeft = (Button) findViewById(R.id.MovementLeft);
		moveRight = (Button) findViewById(R.id.MovementRight);
		jump = (Button) findViewById(R.id.jumpButton);
		shoot = (Button) findViewById(R.id.shootButton);
		shoot2= (Button) findViewById(R.id.Shoot_Left);
		
		//added in
		shield = (Button) findViewById(R.id.Shield);
		
		
		
		shield.setOnTouchListener(new View.OnTouchListener() {

			@Override
			
			
			public boolean onTouch(View v, MotionEvent m) {
				if (GameView.getghostsKilled() >=5){
				GameView.setShieldOn(true);
				GameView.setghostsKilled();
				}
				return true;
				
			}

		});
		
		
		
		moveLeft.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent m) {
				GameView.moveLeft();
				return true;

			}

		});
		moveRight.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent m) {
				GameView.moveRight();
				return true;
			}

		});
		jump.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				GameView.jump();

			}
		});
		shoot.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Bullet.moveForward = true;
				GameView.shoot();
			}
		});
		shoot2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Bullet.moveForward = false;
				GameView.shoot();
			}
		});
		inForeground = true;

	}
	
	@Override
	protected void onPause()	{
		super.onPause();
		inForeground = false;
	}
	
}
