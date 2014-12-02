package uva.cs2110.ghosthunter;

import java.util.concurrent.TimeUnit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GameView extends View {

	private static final int INTERVAL = 100;
	private static final int BACKGROUND_INTERVAL = 1000;
	/*private SensorManager aSensorManager;
	private Sensor accelerometer;
	private float z;*/
	protected static int ghostsKilled = 0;
	protected static Player p1 = new Player();
	protected static Bullet b1 = new Bullet(p1.xPos, p1.getYPos());
	protected static int bitmapHeight;
	protected static int bitmapWidth;
	protected static int ghostBitmapHeight = 0;
	protected static int ghostBitmapWidth = 0;
	protected TextView textview;
	Activity host = (Activity)this.getContext();
	
	Thread monitorThread = (new Thread(new Monitor()));
	Paint paint = new Paint();
	BitmapFactory.Options options = new BitmapFactory.Options();
	Bitmap bg;
	Bitmap bulletPic;
	Bitmap enemyGhost;
	EnemyGhost spooky = null;
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
		bitmapHeight = bg.getHeight();
		bitmapWidth = bg.getWidth();
		bulletPic = BitmapFactory.decodeResource(getResources(), R.drawable.bullet, options);
		enemyGhost = BitmapFactory.decodeResource(getResources(), R.drawable.ufo, options);
		monitorThread.setPriority(Thread.MIN_PRIORITY);
		monitorThread.start();
		
	}

	protected void onDraw(Canvas canvas)	{
		this.canvas = canvas;
		super.onDraw(this.canvas);
		
		if (b1.isShot()) {
			this.canvas.drawBitmap(bulletPic, b1.x, b1.y, paint);
			b1.updateX();
		}
		
		this.canvas.drawBitmap(bg, p1.xPos, p1.getYPos(), paint);
		
		if(spooky == null)	{
			spooky = new EnemyGhost();
		}
		
		//test
		
	
	
		
		
		if(spooky.isAlive)	{
			this.canvas.drawBitmap(enemyGhost, spooky.getXPos(), spooky.getYPos(), paint);
			if(Math.abs((spooky.getXPos() + 50) - b1.getX()) <= 40)	{
				spooky = null;
				ghostsKilled++;
				b1.isShot = false;
			
			}else if (Math.abs((spooky.getXPos() + 50) - p1.getXPos()) <= 40 && !p1.getShieldOn()){
				spooky = null;
				p1 = new Player ();
				ghostsKilled--;
				
				//textview.post(new Runnable() {
				   // public void run() {
				 //       textview.setText("Ghosts Killed: " + ghostsKilled);
				//    } 
				//});
			}
			
			textview = (TextView)host.findViewById(R.id.Scoreboard);
			
			textview.post(new Runnable() {
			    public void run() {
			    	
			        textview.setText("Points: " + ghostsKilled); 
			        
			        if (ghostsKilled >= 20){
			        	
			        	textview = (TextView)host.findViewById(R.id.GameOver);
			        	textview.setTextColor(Color.GREEN);
			        	textview.setText("YOU WIN!");
			        	

			        	textview.setVisibility(View.VISIBLE);
			        	
			        	
			        	
			        
			        }else if (ghostsKilled <= -2){
			        	textview = (TextView)host.findViewById(R.id.GameOver);
			        	textview.setVisibility(View.VISIBLE);
			        }
			        
			    } 
			});
			
 
		}
		
		try {
			if(MainGame.inForeground)	{
				Thread.sleep(INTERVAL);
			}
			else	{
				Thread.sleep(BACKGROUND_INTERVAL);
			}
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
		b1.setShot(true);
		b1.setX(p1.xPos + bitmapWidth);
		b1.setY(p1.getYPos()+(bitmapHeight/2));
		p1.setShield(false);
	}
	
	public static void setShieldOn(boolean b) {
		p1.setShield(b);
	}
	
	public static int getghostsKilled(){
		return ghostsKilled;
	}
	
	public static void setghostsKilled(){
		ghostsKilled = ghostsKilled - 5;
	}


}
