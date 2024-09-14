package in.co.oop;

public class TestPerson {
	public static void main(String[] args) {
		
		PersonEncapsulationTest p = new PersonEncapsulationTest();
		p.setName("Gaurav");
		p.setAddress("Dhar road");
		p.setSalary(80000);
		p.setCity("Indore");
		
		System.out.println("Name : " + p.getName());
		System.out.println("Address : "+ p.getAddress());
		System.out.println("City : "+ p.getCity());
		System.out.println("Salary : "+ p.getSalary());
	}

}
