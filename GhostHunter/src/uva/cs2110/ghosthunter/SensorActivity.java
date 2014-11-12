package uva.cs2110.ghosthunter;

import android.app.*;
import android.content.*;
import android.hardware.*;
import android.os.*;

public class SensorActivity extends Activity implements SensorEventListener {
	private SensorManager aSensorManager;
	private Sensor accelerometer;
	private static float x, y, z;

	@Override
	public final void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		aSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		accelerometer = aSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
	}

	public static float getX() {
		return x;
	}
	
	
	public static float getY() {
		return y;
	}


	public static float getZ() {
		return z;
	}



	@Override
	public final void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	@Override
	public final void onSensorChanged(SensorEvent event) {
		x = event.values[0];
		y = event.values[1];
		z = event.values[2];
		// return 3 values, one for each axis.
		// Do something with values.
	}

	@Override
	protected void onResume() {
		super.onResume();
		aSensorManager.registerListener(this, accelerometer,
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	protected void onPause() {
		super.onPause();
		aSensorManager.unregisterListener(this);
	}
}