package uva.cs2110.ghosthunter;

public interface Item {
	
	public void pickUp();
	
	/**
	 * Uses the item
	 * @return True if the item is used successfully, or false is the item is out of charges or time
	 */
	public boolean use();

	/**
	 * @return The difference of time in seconds since the item was dropped by a ghost
	 */
	public double timeSinceDrop();
	
	/**
	 * After the item has been dropped or used for two long, this method will remove it from the game
	 */
	public void disappear();

}
