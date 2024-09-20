package in.co.oop;

public class ShapeParentConstructor {
	
	protected String color;
	protected int borderwidth;
	public static final float pi = 3.14f;
	
	public ShapeParentConstructor (String color, int borderwidth) {
		
		this.color = color;
		this.borderwidth = borderwidth;
	}

	public String getColor() {
		return color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public static float getPi() {
		return pi;
	}

}
