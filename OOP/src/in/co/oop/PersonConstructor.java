package in.co.oop;

public class PersonConstructor {
	
private String name;
private String city;
private int salary;

public PersonConstructor() {      // Default Constructor
	System.out.println("I'm default constructor.");
}

public PersonConstructor (String name, String city, int salary) {
	this.name = name;
	this.city = city;
	this.salary = salary;
	}

public String getName() {
	return name;
}

public String getCity() {
	return city;
}
public int getSalary() {
	return salary;
}
}
