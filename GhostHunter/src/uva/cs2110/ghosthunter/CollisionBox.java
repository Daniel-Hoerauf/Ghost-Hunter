package uva.cs2110.ghosthunter;

import android.app.Activity;
import android.graphics.*;

public class CollisionBox extends Activity {
	Player p1 = new Player();
	EnemyGhost e1 = new EnemyGhost();
	Bullet b1 = new Bullet(p1.xPos, p1.getYPos());
	Rect player = new Rect(p1.xPos, p1.getYPos(), p1.xPos + 78, p1.getYPos() + 90);
	Rect ghost = new Rect(e1.getXPos(), e1.getYPos(), e1.getXPos() + 100, e1.getYPos() + 51);
	Rect bullet = new Rect(b1.x, b1.y, b1.x + 20, b1.y + 13);
	boolean playerGhostCollision = false;
	boolean bulletGhostCollision = false;
	
	public CollisionBox()	{
		if (Rect.intersects(player, ghost)) {
			playerGhostCollision = true;
		}
		if (Rect.intersects(bullet, ghost)) {
			bulletGhostCollision = true;
		}
		
	}
}