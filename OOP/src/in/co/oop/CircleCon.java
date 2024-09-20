package in.co.oop;

public class CircleCon extends ShapeParentConstructor {
	
	public CircleCon (String color, int radius, int borderwidth) {
		super(color, borderwidth);
		this.radius=radius;
		}
	
	private int radius;

	public int getRadius() {
		return radius;
	}
		public void area() {
			double area = 3.14*radius*radius;
			System.out.println("Area of circle : " +area);
		}
	}
	 
	


