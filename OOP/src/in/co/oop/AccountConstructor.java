package in.co.oop;

public class AccountConstructor {
	
	private String name;
	private String city;
	private double balance;
	
	public AccountConstructor() {
		}
	
	public AccountConstructor (String name, String city, double balance) {
		this.name = name;
		this.city = city;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getBalance() {
		return balance;
	}


	public void deposit(double amount) {
		if (amount>0) {
			balance += amount;
			System.out.println("Deposit Successful, Now new balance is : " +balance);
		
		} else {
			System.out.println("Invalid deposit amount ");
		}
	}
		public void withdraw (double amount1) {
			if (amount1 > 0 && amount1<=balance ) {
				balance-=amount1;
				System.out.println("Withrawal Successful. New balance : " +balance);
			} else {
				System.out.println("Withdrawal Successful or insufficient balance");
			}
		}
public void fundtransfer(double amount2) {
	if (amount2>0 && amount2<=balance) {
		balance-=amount2;
		System.out.println("Fund is transferred successfully, new balance is : "+balance);
	}
}
		
	}


