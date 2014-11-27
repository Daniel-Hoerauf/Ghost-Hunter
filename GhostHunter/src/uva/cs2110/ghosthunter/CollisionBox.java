package uva.cs2110.ghosthunter;



public class CollisionBox {
	
	public double x, y, w, h;
	public Rectangle image;
	
	public CollisionBox(Player p1) {
		x = p1.xPos;
		y = p1.yPos;
		
		this.image = new Rectangle((int)x, (int) y, 50, 20);
	}

	public CollisionBox(Enemy e1) {
		x = e1.xPos;
		y = e1.yPos;
		
		this.image = new Rectangle((int)x, (int) y, 50, 20);
	}
	
	public CollisionBox(Bullet b1) {
		x = b1.x;
		y = b1.y;
		
		this.image = new Rectangle((int)x, (int) y, 50, 20);
	}
	

}
