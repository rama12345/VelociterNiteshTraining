package com.velociter.nitesh.chapter16.exercise2;

import java.util.Random;

public class BankOperation {
	public static void main(String[] args) {
		int[] initialBalance = { 500, 800 }; // The initial account balances
		int[] totalCredits = new int[initialBalance.length]; // Two different cr totals
		int[] totalDebits = new int[initialBalance.length]; // Two different db totals
		int transactionCount = 20; // Number of debits and of credits
		// Create the bank and the clerks...
		Bank theBank = new Bank(); // Create a bank
		Clerk clerk1 = new Clerk(theBank); // Create the first clerk
		Clerk clerk2 = new Clerk(theBank); // Create the second clerk
		// Create the accounts, and initialize total credits and debits
		Account[] accounts = new Account[initialBalance.length];
		for (int i = 0; i < initialBalance.length; i++) {
			accounts[i] = new Account(i + 1, initialBalance[i]); // Create accounts
			totalCredits[i] = totalDebits[i] = 0;
		}
		// Create transactions randomly distributed between the accounts
		Random rand = new Random();
		Transaction transaction; // Stores a transaction
		int amount = 0; // Stores an amount of money
		int select = 0; // Selects an account
		for (int i = 1; i <= transactionCount; i++) {
			// Choose an account at random for credit operation
			select = rand.nextInt(accounts.length);
			amount = 50 + rand.nextInt(26); // Generate amount of $50 to $75
			transaction = new Transaction(accounts[select], // Account
					Transaction.CREDIT, // Credit transaction
					amount); // of amount
			totalCredits[select] += amount; // Keep total credit tally
			// Wait until the first clerk is free
			while (clerk1.isBusy()) {
				try {
					Thread.sleep(25); // Busy so try later
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			clerk1.doTransaction(transaction); // Now do the credit
			// choose an account at random for debit operation
			select = rand.nextInt(accounts.length);
			amount = 30 + rand.nextInt(31); // Generate amount of $30 to $60
			transaction = new Transaction(accounts[select], // Account
					Transaction.DEBIT, // Debit transaction
					amount); // of amount
			totalDebits[select] += amount; // Keep total debit tally
			// Wait until the second clerk is free
			while (clerk2.isBusy()) {
				try {
					Thread.sleep(25); // Busy so try later
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			clerk2.doTransaction(transaction); // Now do the debit
		}
		// Now output the results
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Account Number:" + accounts[i].getAccountNumber() + "\n" + "Original balance : $"
					+ initialBalance[i] + "\n" + "Total credits : $" + totalCredits[i] + "\n" + "Total debits : $"
					+ totalDebits[i] + "\n" + "Final balance : $" + accounts[i].getBalance() + "\n" + "Should be : $"
					+ (initialBalance[i] + totalCredits[i] - totalDebits[i]) + "\n");
		}
	}

}
