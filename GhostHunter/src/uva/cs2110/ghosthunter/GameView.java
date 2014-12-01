package uva.cs2110.ghosthunter;

import android.content.Context;
import android.graphics.*;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import android.hardware.SensorEventListener;

import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;


public class GameView extends View {

	private static final int INTERVAL = 100;
	/*private SensorManager aSensorManager;
	private Sensor accelerometer;
	private float z;*/

	protected static Player p1 = new Player();
	protected static Bullet b1 = new Bullet(p1.yPos, p1.xPos);
	Thread monitorThread = (new Thread(new Monitor()));
	Paint paint = new Paint();
	BitmapFactory.Options options = new BitmapFactory.Options();
	Bitmap bg;
	Bitmap bulletPic;
	Canvas canvas = new Canvas();
	Button moveLeft;
	Button moveRight;

	public GameView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		init();
	} 

	public GameView(Context context) {
		super(context);
		init();
	}

	public GameView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();       
	}
	

	private void init()	{
		setWillNotDraw(false);
		paint.setColor(Color.parseColor("#000000"));
		options.inMutable = true;
		bg = BitmapFactory.decodeResource(getResources(), R.drawable.main_player, options);
		bulletPic = BitmapFactory.decodeResource(getResources(), R.drawable.bullet, options);
		monitorThread.setPriority(Thread.MIN_PRIORITY);
		monitorThread.start();
		
	}

	protected void onDraw(Canvas canvas)	{
		this.canvas = canvas;
		super.onDraw(this.canvas);

		this.canvas.drawBitmap(bg, p1.yPos, p1.xPos, paint);
		this.canvas.drawBitmap(bulletPic, p1.yPos, p1.xPos, paint); //x and y, so think of it as y and x because horizontal
		try {
			Thread.sleep(INTERVAL);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		invalidate();
	}

	private class Monitor implements Runnable {
		public void run() {
			while (true) {
				try {
					Thread.sleep(INTERVAL);
				} catch (InterruptedException e) {
					// This should not be interrupted. If it is, just dump the stack
					// trace.
					e.printStackTrace();
				}
				postInvalidate();
			}
		}
	}

	public static void moveLeft() {
		p1.moveLeft();		
	}

	public static void moveRight() {
		p1.moveRight();		
	}

	public static void jump() {
		p1.jump();		
	}
	
	public static void shoot() {
		b1.updateX();		
	}


}
