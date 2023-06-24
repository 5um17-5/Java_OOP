package OOP;

public class account {
	private int account_number;
	private int account_balance;
	
	public int getBalance() {
		return this.account_balance;
	}
	
	public int getNumber() {
		return this.account_number;
	}
	
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("Amount cannot be negative.");
		}else {
			this.account_balance = balance;
		}
	}
	
	public void setNumeber(int num) {
		this.account_number = num;
	}
	
	public void deposit(int a) {
		if(a < 0) {
			System.out.println("Amount must be more than 0.");
		}else {
			account_balance = account_balance + a;
		}
	}
	
}

