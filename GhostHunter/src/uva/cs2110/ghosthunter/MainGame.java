package uva.cs2110.ghosthunter;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class MainGame extends Activity {

	Button moveLeft;
	Button moveRight;
	Button jump;
	Button shoot;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.game_main);

		moveLeft = (Button) findViewById(R.id.MovementLeft);
		moveRight = (Button) findViewById(R.id.MovementRight);
		jump = (Button) findViewById(R.id.jumpButton);
		moveLeft.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				GameView.moveLeft();
			}

		});
		moveRight.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				GameView.moveRight();
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
				GameView.shoot();

			}
		});

		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.game_main);

	}

}
