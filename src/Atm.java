
public class Atm {
	
	
	public void withdraw(User person, int amt) {
		//check if enough money
		if(person.getBalance() >= 0 && amt > 0) {
			
			//decrease balance
			//print out confirmation message
			
		} else {
			System.out.println("INSUFFICIENT FUNDS OR INVALID AMOUNT");
		}
	}
	
	public void deposit(int amt) {
		//check if enough money
		
		
	}
	
	public void checkBalance(User person) {
		//print balance amount
		System.out.println(person.getName() + "'s balance is: " + person.getBalance());
	}
	
}
