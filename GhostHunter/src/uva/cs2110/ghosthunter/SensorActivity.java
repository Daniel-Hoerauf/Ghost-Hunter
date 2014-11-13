package uva.cs2110.ghosthunter;

import android.app.*;
import android.content.*;
import android.hardware.*;
import android.os.*;

public class SensorActivity extends Activity implements SensorEventListener {
	private SensorManager aSensorManager;
	private Sensor accelerometer;
	private float x, y, z;

	@Override
	public final void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		aSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		accelerometer = aSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
	}

	public void setX(float x) {
		this.x = x;
	}
	
	public float getX() {
		return x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public float getY() {
		return y;
	}

	
	public void setZ(float z) {
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	
	public SensorManager getSensorManager() {
	    return aSensorManager;
	}

	public void setSensorManager(SensorManager sensorManager) {
	    this.aSensorManager = aSensorManager;
	}


	@Override
	public final void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	@Override
	public final void onSensorChanged(SensorEvent event) {
		x = event.values[0];
		y = event.values[1];
		z = event.values[2];
		
	    if (z == 0.0){
	        Player.stop();
	    }
	    if(z >= 1.5){
	        Player.moveRight();
	    }

	    if (z <= -1.5){
	        Player.moveLeft();
	    }
		
	}

	@Override
	protected void onResume() {
		super.onResume();
		aSensorManager.registerListener(this, accelerometer,
				SensorManager.SENSOR_DELAY_GAME);
	}

	@Override
	protected void onPause() {
		super.onPause();
		aSensorManager.unregisterListener(this);
	}
}