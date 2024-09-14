package in.co.oop;

public class EmployeeEncapsulation {
	private int id;
	private String name;
    private String designation;
	private int salary;
	private char grade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	

 public static void main(String[] args) {
	 
	 EmployeeEncapsulation e = new EmployeeEncapsulation();
	 
	 e.setId(1234);
	 e.setName("Gaurav Verma");
	 e.setDesignation("Java Developer");
	 e.setGrade('A');
	 e.setSalary(75000);
	 
	 System.out.println("Employee Id : "+ e.getId());
	 System.out.println("Employee Name : "+ e.getName());
	 System.out.println("Designation : "+ e.getDesignation());
	 System.out.println("Grade : "+ e.getGrade());
	 System.out.println("Salary : "+ e.getSalary());
	 
	 
 }
}