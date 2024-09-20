package in.co.oop;

public class TestOverride {
	public static void main(String[] args) {
		
		RectangleOverride r = new RectangleOverride("Black", 20, 60, 80);
		
		System.out.println("Color : "+r.getColor());
		System.out.println("Borderwidth : " +r.getBorderwidth());
		System.out.println("Length:"+r.getLength() + " Width:"+r.getWidth());
		System.out.println(r.area());
	}

}
