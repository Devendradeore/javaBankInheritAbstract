public abstract class BankAccount {
	// Fields
	double balance;
	double interestRate;
	double monthlyFee;
	// Assigned Fields (to be incremented and reset each month)
	int numberOfDeposits = 0;
	int numberOfWithdrawals = 0;
	/**
	 * The Constructor is called when an instance of an object is created
	 * @param balance - initial bank balance
	 * @param interestRate - annual interest rate
	 * @param monthlyFee - cost for the bank account each month
	 */
	BankAccount(double bal, double interest, double cost) {
		balance = bal;
		interestRate = interest;
		monthlyFee = cost;
	}
	/**
	 * Adds the deposit amount to the current balance
	 * Increments the number of deposits 
	 * @param depositAmount - amount of cash deposited into bank account
	 */
	public void deposit(double depositAmount) {
		balance += depositAmount;
		numberOfDeposits++;
	}
	/**
	 * Subtracts the withdrawal amount from the current balance
	 * Increments the number of withdrawals 
	 * @param withdrawalAmount - amount of cash withdrawn from bank account
	 */
	public void withdrawal(double withdrawalAmount) {
		balance -= withdrawalAmount;
		numberOfWithdrawals++;
	}
	/**
	 * Adds the monthly interest amount to the current balance
	 */
	public void addInterest() {
		double monthlyInterestRate = (getInterestRate() / 100) / 12;
		double monthlyInterest = balance * monthlyInterestRate;
		balance += monthlyInterest;
	}
	/**
	 * Subtract the monthly fee from the balance
	 * Calls the addInterest() method - adds monthly interest to balance
	 * Resets the monthly number of deposits and withdrawals back to 0
	 */
	public void monthlyTotalAmount() {
		balance -= monthlyFee;
		addInterest();
		numberOfDeposits = 0;
		numberOfWithdrawals = 0;
	}
	/**
	 * The setMonthlyFee method sets the monthly fee to a new value
	 * @param newFee - the new fee amount
	 */
	public void setMonthlyFee(double newFee)
	{		
		monthlyFee = newFee;
	}
	/**
	 * The getBalance method returns the total balance
	 * @return balance - returns the balance
	 */
	public double getBalance()
	{		
		return balance;
	}
	/**
	 * The getNumberOfDeposits method returns the numberOfDeposits made in the month
	 * @return numberOfDeposits - returns the numberOfDeposits made in the month
	 */
	public int getNumberOfDeposits()
	{		
		return numberOfDeposits;
	}
	/**
	 * The getNumberOfWithdrawals method returns the numberOfWithdrawals made in the month
	 * @return numberOfWithdrawals - returns the numberOfWithdrawals made in the month
	 */
	public int getNumberOfWithdrawals()
	{		
		return numberOfWithdrawals;
	}
	/**
	 * The getInterestRate method returns all of the incorrect questions
	 * @return incorrectQuestions - returns the incorrect question numbers
	 */
	public double getInterestRate()
	{		
		return interestRate;
	}
	/**
	 * The getMonthlyFee method returns the monthly fee to have an account
	 * @return monthlyFee - returns the the monthly fee to have an account
	 */
	public double getMonthlyFee()
	{		
		return monthlyFee;
	}
	/**
	 * The withdraw method is abstract.
	 * It must be overridden in a subclass.
	 * @return 
     */
	public abstract void withdraw();
	/**
	 * The deposit method is abstract.
	 * It must be overridden in a subclass.
	 * Checks to see if current balance is valid for withdrawal
     */
	public abstract void deposit();
	/**
	 * The monthlyTotal method is abstract.
	 * It must be overridden in a subclass.
	 * Determines the monthly total amount - including fees
     */
	public abstract void monthlyTotal();
}
