package uva.cs2110.ghosthunter;

public class Rectangle {
	
	private float length;
	private float width;
	private float x;
	private float y;
	
	public Rectangle() {
		this.length = 10;
		this.width = 5;
	}	
	
	public Rectangle(float length, float width) { //The arguments here match the fields
		this.length = length; //The this.length refers to the field length and the second length is the parameter
		this.width = width;
	}
	
	public Rectangle(float x, float y, float length, float width) { //The arguments here match the fields
		this.length = length; //The this.length refers to the field length and the second length is the parameter
		this.width = width;
		this.x = x;
		this.y = y;
	}
	
	// Next, getters and setters (first two are getters, last two are setters)
	
	public float getLength() {
		return length;
		//OR return this.length;
	}

	public float getWidth() {
		return width;
		//OR return this.width;
	}
	
	public void setLength (float l) {
		this.length = l;
		//length = l;	
	}
	
	public void setWidth (float w) {
		this.width = w;
	}
	
	public float getArea () {
		return this.length * this.width;
	}
	
	public float getPerim() {
		return 2*(length + width);
	}
}
	