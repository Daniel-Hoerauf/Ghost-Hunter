package uva.cs2110.ghosthunter;

import android.app.Activity;
import android.os.AsyncTask;

public class Changelocation extends AsyncTask<Integer, GameView, Double>{

	GameView theView;
	@Override
	protected Double doInBackground(Integer... params) {
		while (!this.isCancelled()){
			this.publishProgress((GameView)Activity.findViewById((int) params));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
		return  0.0;
	}
	
	@Override
	protected void onProgressUpdate(GameView... params){
		 for (GameView cv : params) {
			 cv.invalidate();
		 }
	}
	
	@Override
	protected void onPostExecute(Double result) {
		
	}
	
	@Override
	protected void onCancelled() {
		
	}

}
