package inheritance;

public class SuperKeyword {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.displayBalance();
	}
}



class Father {
	int bank_balance = 500_000;
}

class Daughter extends Father {
	int bank_balance = 300_000;
	public void displayBalance() {
		System.out.println("Bank balance: " + super.bank_balance);
	}
}
