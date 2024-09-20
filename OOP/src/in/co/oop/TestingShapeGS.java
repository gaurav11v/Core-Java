package in.co.oop;

public class TestingShapeGS {
	public static void main(String[] args) {
		
		RectangleGS r = new RectangleGS();
		r.setColor("Black");
		r.setBorderwidth(2);
		r.setLength(20);
		r.setWidth(30);
		
		CircleGS c = new CircleGS();
		c.setBorderwidth(3);
		c.setColor("Red");
		c.setRadius(8);
		
		
		TriangleGS t = new TriangleGS();
	    t.setBorderwidth(4);
	    t.setColor("Blue");
	    t.setBase(50);
	    t.setHeight(30);
	    
	    System.out.println("Color of Rectangle : " +r.getColor());
	    System.out.println("Borderwidth : " +r.getBorderwidth());
	    System.out.println("Length : " +r.getLength());
	    System.out.println("Width : " +r.getWidth());
	    r.area();
	    
	    System.out.println();
	    System.out.println("Color of Circle : "+ c.getColor());
	    System.out.println("Borderwidth : " +c.getBorderwidth());
	    System.out.println("Radius : " +c.getRadius());
	    c.Area1();
	   
	    System.out.println();
	    System.out.println("Color of Triangle : " +t.getColor());
	    System.out.println("Borderwidth : " +t.getBorderwidth());
	    System.out.println("Base : " +t.getBase());
	    System.out.println("Height : " +t.getHeight());
	    t.area2();
	  
	   
	}

}
