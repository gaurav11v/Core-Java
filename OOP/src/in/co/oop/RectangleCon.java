package in.co.oop;

public class RectangleCon extends PersonConstructor {
	
	private int length;
	private int width;
	
	public RectangleCon (int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
 public void area() {
	 int area = length*width;
	 System.out.println("Area of Rectangle : " +area);
 }
}
