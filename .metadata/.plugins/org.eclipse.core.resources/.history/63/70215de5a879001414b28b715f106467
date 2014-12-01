package uva.cs2110.ghosthunter;

public class EnemyGhost implements Ghost {
	
	private float xPos;
	private float yPos;
	private float xSpeed;
	protected boolean isAlive;

	private int screenWidth;
	private int screenHeight;
	
	public EnemyGhost() {
		isAlive = true;
		screenWidth = MainGame.width;
		screenHeight = MainGame.height;
		yPos = (800);
		xPos = (float) (Math.random() * (screenWidth - GameView.bitmapWidth - 100)) ;
		xSpeed = 10;
	}

	@Override
	public float getXPos() {
		updateXPos();
		return xPos;
	}

	@Override
	public float getYPos() {
		return yPos;

	}

	@Override
	public void updateXPos() {
		double deltX = xSpeed + 1 * (Math.random() * GameView.ghostsKilled);
		if(Math.random() > .5)	{
			deltX = -deltX;
		}
		xPos = xPos + (int) deltX;

	}

}
