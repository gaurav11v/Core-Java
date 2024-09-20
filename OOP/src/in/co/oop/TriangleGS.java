package in.co.oop;

public class TriangleGS extends ShapeParent {
	
	private int base;
	private int height;
	public static final float c = 0.5f;
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	public static float getC() {
		return c;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public void area2() {
		System.out.println("Area of a Triangle is : "+ c*base*height);
		
	}
	
	

}
