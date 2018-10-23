
public class User {
	int accountNum;
	int pinNum;
	String name;
	double balance;
	
	public User(int accNum, int pin, double bal, String name) {
		this.accountNum = accNum;
		this.pinNum = pin;
		this.name = name;
		this.balance = bal;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}//User
