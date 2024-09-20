package in.co.oop;

public class ShapeOverride {
	
	private String color;
	private int borderwidth;
	
	public ShapeOverride (String color, int borderwidth) {
		this.color = color;
		this.borderwidth = borderwidth;
	}
	
	
	public String getColor() {
		return color;
	}


	public int getBorderwidth() {
		return borderwidth;
	}


	public double area() {
		return 0;
	}

}
