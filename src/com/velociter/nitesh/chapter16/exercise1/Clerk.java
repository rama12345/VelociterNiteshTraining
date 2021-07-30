package com.velociter.nitesh.chapter16.exercise1;

public class Clerk implements Runnable {
	// Constructor
	public Clerk(Bank theBank) {
		this.theBank = theBank; // Who the clerk works for
		initiallyTransaction = null; // No transaction initially
	}

	// Receive a transaction
	public void doTransaction(Transaction transaction) {
		initiallyTransaction = transaction;
	}

	// The working clerk...
	public void run() {
		while (true) {
			while (initiallyTransaction == null) { // No transaction waiting?
				try {
					Thread.sleep(150); // Then take a break...
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			theBank.doTransaction(initiallyTransaction);
			initiallyTransaction = null; // In-tray is empty
		}
	}

	// Busy check
	public boolean isBusy() {
		return initiallyTransaction != null; // A full in-tray means busy!
	}

	private Bank theBank; // The employer - an electronic marvel
	private Transaction initiallyTransaction; // The in-tray holding a transaction
}
