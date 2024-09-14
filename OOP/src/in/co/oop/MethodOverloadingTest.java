package in.co.oop;

public class MethodOverloadingTest {
	public void sum() {
		System.out.println("Hello world");
	}
	public int sum (int a) {
		System.out.println("I'm parameterized method.");
		return a;
	}
	public void sum(int a, int b) {
		System.out.println("I'm two parameterized method.");
		
	}
public static void main(String[] args) {
	
	MethodOverloadingTest m = new MethodOverloadingTest();
	m.sum();
	m.sum(10);
	m.sum(30, 40);
	
}
}
