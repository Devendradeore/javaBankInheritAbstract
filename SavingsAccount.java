import java.util.Scanner;

public class SavingsAccount extends BankAccount {
	// Fields
	boolean active;
	/**
	 * The Constructor sets the balance, annual interest rate,
	 * and the monthly cost for the savings bank account.
	 * @param b - initial balance in savings account
	 * @param i - interest rate per year
	 * @param c - cost per month
	 */
	public SavingsAccount(double b, double i, double c) {
		super(b, i, c);
	}
	/**
	 * The withdraw method checks to see if there is a minimum of $100.
	 * If there is $100 or more in the savings account it will be active.
	 * If the savings account is active, withdrawals will be permitted.
	 * If there is less than $100 the savings account won't be active.
	 * If the savings account is inactive, withdrawals will not be permitted.
	 * @return 
     */
	@Override
	public void withdraw() {
		// Check to see if account is active (>= $100)
		if (super.getBalance() >= 100) {
				active = true;
		} else {
			active = false;
		}
		if (active) {
	    	System.out.print("How much money would you like to withdraw?: $");
			// Create a Scanner object to read input
			Scanner keyboard = new Scanner (System.in);
			// enter withdrawal amount
	    	double currentWithdrawal = keyboard.nextDouble();
	    	// Check balance greater than withdrawal amount
	    	if (super.getBalance() < currentWithdrawal) {
	    		System.out.print("Withdrawal amount exceeds funds...");
	    		System.exit(0);
	    	} else {
	    		// Use the super class - Bank Account - withdrawal method to withdraw amount
				super.withdrawal(currentWithdrawal);
	    	}
		} else {
			System.out.println("Insufficient funds for withdrawal...");
			System.exit(0);
		}
	}
	/**
	 * The deposit method deposits cash into the bank account
	 * If the current balance + current deposit is $100 or greater
	 * The account will become active again, else it will be inactive.
     */
	@Override
	public void deposit() {
    	System.out.print("How much money would you like to deposit?: $");
		// Create a Scanner object to read input
		Scanner keyboard = new Scanner (System.in);
		// enter withdrawal amount
    	double currentDeposit = keyboard.nextDouble();
    	// Use the super class - Bank Account - deposit method to deposit amount
		super.deposit(currentDeposit);
    	// Check to see if account is active (>= $100)
		if ((super.getBalance() + currentDeposit) >= 100) {
			active = true;
		} else {
		active = false;
		}
	}
	/**
	 * Works out the monthly fee
	 * If more than 4 withdrawals, add $1 to monthly fee
	 * for every additional withdrawal
     */
	@Override
	public void monthlyTotal() {
    	int currentMonthlyWithdrawals = super.getNumberOfWithdrawals();
    	if (currentMonthlyWithdrawals > 4) {
    		monthlyFee = (currentMonthlyWithdrawals - 4) + super.getMonthlyFee();
    	} else {
    		monthlyFee = super.getMonthlyFee();
    	}
    	// Subtracts monthly fee, adds interest. 
    	// Resets monthly deposits and withdrawals to 0
    	super.monthlyTotalAmount();
    	// Set monthlyFee back
    	monthlyFee = super.getMonthlyFee();
		// Check to see if account is active (>= $100)
		if (super.getBalance() >= 100) {
				active = true;
		} else {
			active = false;
		}	
	}
}
