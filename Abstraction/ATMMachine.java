package Abstraction;

public class ATMMachine {
	public void enterCard() {
		System.out.println("Card verification");
	}
	
	public void enterPin() {
		System.out.println("Pin verification");
	}
	
	public void cashWithdrawl() {
		System.out.println("To withdraw cash from ATM");
		validateWithdrawlAmount();
		updateAmount();
		cashDispose();
	}
	
	public void validateWithdrawlAmount() {
		System.out.println("Validate the withdraw amount");
	}
	
	public void updateAmount() {
		System.out.println("Update the amount after withdraw");
	}
	
	public void cashDispose() {
		System.out.println("Dispose cash from ATM");
	}
	
	public void miniStatement() {
		System.out.println("Get the mini statement");
	}
}
