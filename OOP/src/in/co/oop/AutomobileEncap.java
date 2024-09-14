package in.co.oop;

public class AutomobileEncap {
	
private String make;
private String color;
private int speed;
private int gears=5;

public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getGears() {
	return gears;
}
public void setGears(int gears) {
	this.gears = gears;
}
public void changeOfGears() {
    System.out.println("Speed for each gear:");
    int speedIncrement = 20;
    if (gears>5) {
    	System.out.println("Invalid Gear");
    } else {
    for (int gear = 1; gear <= gears; gear++) {
        int gearSpeed = speedIncrement * gear;
        System.out.println("Gear " + gear + " and Speed is  " + gearSpeed + " km/hr.");
    }
    }
}


public static void main(String[] args) {
	
	AutomobileEncap a = new AutomobileEncap();
	a.setColor("Black");
	a.setMake("Honda City");
	a.setSpeed(120);
	a.setGears(2);
	a.changeOfGears();
	
	System.out.println("Vehicle Color : " +a.getColor());
	System.out.println("Company : " +a.getMake());
	System.out.println("Speed : " +a.getSpeed() +"km/hr");
	System.out.println("No. of gears : " +a.getGears());
	
	}
}





