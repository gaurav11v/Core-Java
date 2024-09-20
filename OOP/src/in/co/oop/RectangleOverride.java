package in.co.oop;

public class RectangleOverride extends ShapeOverride {
	 private int length;
	 private int width;
	 
	 public RectangleOverride(String color, int borderwidth, int length, int width) {
		super (color, borderwidth);
		this.length = length;
		this.width = width;
		
		
	 }

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	 

}
