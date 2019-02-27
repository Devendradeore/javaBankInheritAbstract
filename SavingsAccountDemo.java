public class SavingsAccountDemo {

	public static void main(String[] args) {
		  // Create a SavingsAccount object	
		  // $10,000 initial amount, 3% annual interest rate, $4 fee per month
		  // Note: monthly fee will increase if more than 4 withdrawals
	      SavingsAccount mySavingsAcc = new SavingsAccount(10000, 3, 4);
	      // 5 Withdrawals to create new monthly fee $4 + $1 * x,
	      // x = number - 4 (additional withdrawals)
	      // e.g. 5 - 4 = 1 additional withdrawal
	      // fee = $4 + $1 * 1 = $5
	      // 4 or less will result in $4 monthly fee
	      mySavingsAcc.withdraw();
	      mySavingsAcc.withdraw();
	      mySavingsAcc.withdraw();
	      mySavingsAcc.withdraw();
	      mySavingsAcc.withdraw();
	      // Check the balance
	      System.out.println("The balance is: $" + mySavingsAcc.balance);
	      // Deposit
	      mySavingsAcc.deposit();
	      // Check the balance
	      System.out.println("The balance is: $" + mySavingsAcc.balance);
	      // Check number of withdrawals
	      System.out.println("The number of withdrawals this month is: "
	      + mySavingsAcc.numberOfWithdrawals);
	      // Check number of deposits
	      System.out.println("The number of deposits this month is: "
	      + mySavingsAcc.numberOfDeposits);
	      // Works out monthly fee
	      // monthlyTotal() calls super.monthlyTotalAmount()
	      // This Subtracts monthly fee, adds interest. 
	      // Resets monthly deposits and withdrawals to 0
	      mySavingsAcc.monthlyTotal();
	      System.out.println("The monthly fee is: $" + mySavingsAcc.monthlyFee);
	      System.out.println("The total balance (including fees and interest) this month is: $" + mySavingsAcc.balance);
	      // If Savings account is active or not (>=$100)
	      if (mySavingsAcc.balance >= 100) {
	    	  System.out.println("The Savings Account is still active (>=$100).");
	      } else {
	    	  System.out.println("The Savings Account is inactive (<$100)");
	    	  System.out.println("Please make a deposit such that the balance is over $100 to reactivate");
	      }
	}
}
