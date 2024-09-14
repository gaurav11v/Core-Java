package in.co.oop;

public class AccountConstructorTest {
	public static void main(String[] args) {
		
		AccountConstructor a = new AccountConstructor("Shyam", "Agra", 10000);
		
		System.out.println("Bank Account details are :--- ");
		
		System.out.println("Name : " +a.getName());
		System.out.println("City : " +a.getCity());
		System.out.println("Initial balance : " +a.getBalance());
		System.out.println();
		System.out.println("Account transactions are as follows :--- ");
		System.out.println("-*-*-*-*-*-*-*-*-");
		a.deposit(500);
		a.fundtransfer(300);
		a.withdraw(600);
	}

}
