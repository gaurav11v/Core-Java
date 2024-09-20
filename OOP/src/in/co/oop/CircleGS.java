package in.co.oop;

public class CircleGS extends ShapeParent {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void Area1() {
		System.out.println("Area of a Circle : "+ pi*radius*radius);
	}
	
}
