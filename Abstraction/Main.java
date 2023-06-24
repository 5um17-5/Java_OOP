package Abstraction;

public class Main {
	public static void main(String[] args) {
		ATMMachine atm = new ATMMachine();
		atm.enterCard();
		atm.enterPin();
		atm.cashWithdrawl();
//		atm.validateWithdrawlAmount(); // this method is not important on the screen
//		atm.updateAmount(); // this method is not important on the screen
//		atm.cashDispose();
	}
}
