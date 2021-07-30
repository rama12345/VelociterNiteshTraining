package com.velociter.nitesh.chapter16.exercise3;

public class Bank {
	// Perform a transaction
	public void doTransaction(Transaction transaction) {
		switch (transaction.getTransactionType()) {
		case Transaction.CREDIT:
			synchronized (transaction.getAccount()) {
				// Get current balance
				int balance = transaction.getAccount().getBalance();
				
				// Credits require require a lot of checks...
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				// Increment the balance
				balance += transaction.getAmount(); 
				
				// Restore account balance
				transaction.getAccount().setBalance(balance); 
				break;
			}
		case Transaction.DEBIT:
			synchronized (transaction.getAccount()) {
				// Get current balance
				int balance = transaction.getAccount().getBalance();
				// Debits require even more checks...
				try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				// Increment the balance...
				balance -= transaction.getAmount(); 
				
				// Restore account balance
				transaction.getAccount().setBalance(balance);
				break;
			}
		default: // We should never get here
			System.out.println("Invalid transaction");
			System.exit(1);
		}
	}
}
