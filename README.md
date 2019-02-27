-----
About
-----

BankAccount.java is the Super Class for Savings Account. This program was created to develop OOP skills, in particular -
Inheritance and Abstraction. BankAccount.java has a deposit, withdrawal, addInterest, and monthlyTotalAmount methods. It also has the
setter/mutator method: setMonthlyFee, and the getter/accessor methods: getBalance, getNumberOfDeposits, getNumberOfWithdrawals, 
getInterestRate, and getMonthlyFee. BankAccount.java is an abstract class with the abstract methods withdraw, deposit, and monthlyTotal.

Abstract classes can't be instantiated and BankAccount serves as a Superclass for the SavingsAccount Subclass.
The SavingsAccount Subclass defines the above abstract methods and extends (inherits) the other propeties and methods from
BankAccount.

SavingsAccountDemo.java provides a demo sample of how to utilise the bank program that has been created. In this file,
a new object mySavingsAcc is created from its constructor. This takes the value $10,000, 3% Annual Interest, and a
$4 monthly fee. This will be the amount in the bank, the interest rate, and fees we will be working with.

If more than 4 withdrawals are made per month the fee will be increased by $1 per additional transaction. The program asks the user
for withdrawals and deposits and displays the total amount in the bank account. It also outputs the number of deposits and withdrawals 
made.

**WARNING**: monthlyTotal() calls super.monthlyTotalAmount(). This Subtracts monthly fee, adds interest. 
             **Resets monthly deposits and withdrawals to 0.**
             
 Ensure that the monthlyTotal() is called after the deposits and withdrawls number has been output else it will be reset to 0.
 
 The program calculates the balance at the end of the month taking into consideration all deposits, withdrawals, fees, 
 and interest.

-------------
Configuration
-------------
Recommended Operating System: Any

Software Required: Java

------------
Installation
------------
Download BankAccount.java & SavingsAccount.java && SavingsAccountDemo.java files from Github
(or alternate link)

----------------------
Operating Instructions
----------------------
1. BankAccount.java & SavingsAccount.java && SavingsAccountDemo.java in the same directory and run the file.

2. Run SavingsAccountDemo.java

3. Follow the prompts and entered the desired deposit and withdrawal amounts.

4. The Program will output appropriate information in the console.

5. The user can create their own demo by changing the values in the constructor and the functions order/frequency.

-------------
File manifest
-------------
Includes README.md, BankAccount.java, SavingsAccount.java, SavingsAccountDemo.java

-----------------------------------
Copyright and Licensing information
-----------------------------------
BankAccount.java & SavingsAccount.java && SavingsAccountDemo.java is public domain software - free and open source

---------------
Troubleshooting
---------------
monthlyTotal() calls super.monthlyTotalAmount(). This Subtracts monthly fee, adds interest. 
Resets monthly deposits and withdrawals to 0.
Take care when editing SavingsAccountDemo.java to ensure the correct order of the function call.

Ensure input values are entered as double or integers. This program has minimal validation as the focus was on
OOP inheritance/abstraction skills. Enter input and follow the prompts as expected.

File Permissions - If you are denied access to reading, writing, or executing
BankAccount.java, SavingsAccount.java, or SavingsAccountDemo.java - from the linux terminal you can type chmod a+r BankAccount.java,
chmod a+w SavingsAccount.java, or chmod a+x SavingsAccountDemo.java.

Please ensure you are in the correct directory
-------
Queries
-------
For any queries please contact Jon Peppinck at mrjonpeppinck@gmail.com

