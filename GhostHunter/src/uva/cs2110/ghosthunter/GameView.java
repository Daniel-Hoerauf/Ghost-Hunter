package uva.cs2110.ghosthunter;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {

	Paint paint = new Paint();
	BitmapFactory.Options options = new BitmapFactory.Options();
	Bitmap bg;

	public GameView(Context context, AttributeSet attrs)
	{
	    super(context, attrs);
	    paint.setColor(Color.parseColor("#000000"));
	    options.inMutable = true;
	    bg = BitmapFactory.decodeResource(getResources(), R.drawable.main_player, options);
	} 
	
	public GameView(Context context) {
		super(context);
	    paint.setColor(Color.parseColor("#000000"));
	    options.inMutable = true;
	    bg = BitmapFactory.decodeResource(getResources(), R.drawable.main_player, options);
		
	}
	
	public GameView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
	    paint.setColor(Color.parseColor("#000000"));
	    options.inMutable = true;
	    bg = BitmapFactory.decodeResource(getResources(), R.drawable.main_player, options);        
    }
	
	public void onDraw(Canvas canvas)	{
		super.onDraw(canvas);
		canvas.drawBitmap(bg, 600, 600, paint); //x and y, so think of it as y and x because horizontal
		this.invalidate();
	}

}
