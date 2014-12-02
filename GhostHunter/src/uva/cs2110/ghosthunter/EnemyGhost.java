package uva.cs2110.ghosthunter;

public class EnemyGhost implements Ghost {

	private int xPos;
	private int yPos;
	private int xSpeed;
	protected boolean isAlive;

	private int screenWidth;
	private int screenHeight;

	public EnemyGhost() {
		isAlive = true;
		screenWidth = MainGame.width;
		screenHeight = MainGame.height;
		yPos = (800);
		xPos = (int) (Math.random() * (screenWidth - GameView.bitmapWidth - 100)) ;
		xSpeed = 10;
	}

	@Override
	public int getXPos() {
		updateXPos();
		return xPos;
	}

	@Override
	public int getYPos() {
		return yPos;

	}

	@Override
	public void updateXPos() {
		double deltX = xSpeed + 1 * (Math.random() * GameView.ghostsKilled);
		if(Math.random() > .4)	{
			deltX = -deltX;
		}
		xPos = xPos + (int) deltX;

	}

}
