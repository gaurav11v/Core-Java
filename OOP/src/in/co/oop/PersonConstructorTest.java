package in.co.oop;

public class PersonConstructorTest {
	
	public static void main(String[] args) {
		
		PersonConstructor p = new PersonConstructor("Gaurav", "Indore", 75000);
		
		System.out.println("Name : " + p.getName());
		System.out.println("City : "+ p.getCity());
		System.out.println("Salary : " + p.getSalary());
		
	}

}
