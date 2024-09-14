package in.co.oop;

public class AccountEncapTest {
 private String id;
 private String name;
 private int balance;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

public void deposit(double amount){
	if (amount>0) {
		balance += amount;
		System.out.println("Deposit Successful. New balance : "+balance);
	} else {
		System.out.println("Invalid deposit amount.");
	}
}
	public void withdraw (double amount1) {
		if (amount1 > 0 && amount1<=balance ) {
			balance-=amount1;
			System.out.println("Withrawl Successful. New balance : " +balance);
		} else {
			System.out.println("Withdrawl Successful or insufficient balance");
		}
	
}


  public static void main(String[] args) {
	
	  AccountEncapTest a = new AccountEncapTest();
	  a.setId("abc");
	  a.setName("Alex");
	  a.setBalance(10000);
	  a.deposit(200);
	  a.withdraw(500);

	  
	  System.out.println("Id : " +a.getId());
	  System.out.println("Name : " +a.getName());
	  System.out.println("Balance : " +a.getBalance());
	  
	  
  }
}
