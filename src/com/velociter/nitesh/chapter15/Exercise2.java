package com.velociter.nitesh.chapter15;

import java.util.Scanner;
import java.util.Stack;

public class Exercise2 {
	public static void main(String[] args) {
		// Scanner && User Variables
		Scanner input = new Scanner(System.in);
		int usersDecision = 0;
		// Users && Dealers Value Variables
		int usersValue = 0;
		int dealersValue = 0;
		// Suit && Rank Arrays
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		// Array Lists Users Cards && Dealers Cards
		Stack<String> usersCards = new Stack<String>();
		Stack<String> dealersCards = new Stack<String>();
		// GENERATE DEALERS FIRST CARD
		for (int i = 0; i <= 1; i++) {
			int randomGenNumber = (int) (Math.random() * 13);
			dealersCards.add(cards[randomGenNumber]);
		}
		// Print Dealers First Card
		System.out.println("The Dealer Was Dealt: " + dealersCards);
		// Deal Users Two Cards
		for (int i = 0; i <= 1; i++) {
			int randomGenNumber = (int) (Math.random() * 13);
			usersCards.add(cards[randomGenNumber]);
		}
		// Print Users Two Cards
		System.out.println("The User Was Dealt: " + usersCards);
		// Check For BlackJack
		if (usersCards.contains("Ace")) {
			if (usersCards.contains("King") || usersCards.contains("Queen") || usersCards.contains("Jack")
					|| usersCards.contains("10")) {
				System.out.println("You've Got BlackJack! Congratulations, You Win!");
				System.exit(0);
			} else {
				System.out.println("You Did Not Get BlackJack!\n[1] Twist\n[2] Stick");
			}
		} else {
			System.out.println("You Did Not Get BlackJack! :( \n[1] Twist\n[2] Stick");
		}
		// Take Users Decision Check Users Decision While Loop Switch Statement For
		// Users Decision
		int x = 0;
		while (x == 0) {
			usersDecision = input.nextInt();
			switch (usersDecision) {
			case 1:
				System.out.println("You've Twisted - Your Cards: " + usersCards);
				System.out.println("You've Twisted - Additional Card Dealt");
				x = 0;
				// WHILE Twisting = True Generate New Cards Check Value of Cards
				// Bust/Twist/Stick For User
				for (int i = 0; i <= 0; i++) {
					int randomGenNumber = (int) (Math.random() * 13);
					usersCards.add(cards[randomGenNumber]);
				}
				System.out.println(usersCards + "\n");
				// Generate Users Card Value
				usersValue = 0;
				for (int i = 0; i < usersCards.size(); i++) {
					if (usersCards.get(i).equals("2")) {
						usersValue += 2;
					} else if (usersCards.get(i).equals("3")) {
						usersValue += 3;
					} else if (usersCards.get(i).equals("4")) {
						usersValue += 4;
					} else if (usersCards.get(i).equals("5")) {
						usersValue += 5;
					} else if (usersCards.get(i).equals("6")) {
						usersValue += 6;
					} else if (usersCards.get(i).equals("7")) {
						usersValue += 7;
					} else if (usersCards.get(i).equals("8")) {
						usersValue += 8;
					} else if (usersCards.get(i).equals("9")) {
						usersValue += 9;
					} else if (usersCards.get(i).equals("10")) {
						usersValue += 10;
					} else if (usersCards.get(i).equals("Jack")) {
						usersValue += 10;
					} else if (usersCards.get(i).equals("Queen")) {
						usersValue += 10;
					} else if (usersCards.get(i).equals("King")) {
						usersValue += 10;
					} else if (usersCards.get(i).equals("Ace")) {
						usersValue += 11;
					}
				}
				// Print Users Value
				System.out.println("Users Cards Value: " + usersValue + "");
				if (usersValue != 21 && usersValue <= 21) {
					System.out.println("You Did Not Get BlackJack!\n[1] Twist\n[2] Stick");
				} else if (usersValue == 21) {
					System.out.println("You Got BlackJack! Congratulations!");
				} else if (usersValue > 21) {
					System.out.println("You've Bust! You Lose!");
					System.exit(0);
				}
				break;
			case 2:
				// Dealers Second Card && Check Dealers Value && Take Action
				System.out.println("Dealing Dealers Second Card!");
				for (int i = 0; i <= 0; i++) {
					int randomGenNumber = (int) (Math.random() * 13);
					dealersCards.add(cards[randomGenNumber]);
				}
				System.out.println(dealersCards + "\n");
				// For Loop Generate Dealers Card Value
				dealersValue = 0;
				for (int i = 0; i < dealersCards.size(); i++) {
					if (dealersCards.get(i).equals("2")) {
						dealersValue += 2;
					} else if (dealersCards.get(i).equals("3")) {
						dealersValue += 3;
					} else if (dealersCards.get(i).equals("4")) {
						dealersValue += 4;
					} else if (dealersCards.get(i).equals("5")) {
						dealersValue += 5;
					} else if (dealersCards.get(i).equals("6")) {
						dealersValue += 6;
					} else if (dealersCards.get(i).equals("7")) {
						dealersValue += 7;
					} else if (dealersCards.get(i).equals("8")) {
						dealersValue += 8;
					} else if (dealersCards.get(i).equals("9")) {
						dealersValue += 9;
					} else if (dealersCards.get(i).equals("10")) {
						dealersValue += 10;
					} else if (dealersCards.get(i).equals("Jack")) {
						dealersValue += 10;
					} else if (dealersCards.get(i).equals("Queen")) {
						dealersValue += 10;
					} else if (dealersCards.get(i).equals("King")) {
						dealersValue += 10;
					} else if (dealersCards.get(i).equals("Ace")) {
						dealersValue += 11;
					}
				}
				// Print Dealers Value
				System.out.println("Dealers Cards Value: " + dealersValue + "");
				// Take Action On Dealers Value
				int y = 0;
				while (y == 0) {
					dealersValue = 0;
					// If Dealers Value: <=16 == 17 < 17 == 21 > 21
					if (dealersValue <= 16) {
						int randomGenNumber = (int) (Math.random() * 13);
						dealersCards.add(cards[randomGenNumber]);
						System.out.println("Dealer Has Less Than 17 - Taking Another Card\n");
						System.out.println("Dealers Cards: " + dealersCards);
						dealersValue = 0;
						for (int i = 0; i < dealersCards.size(); i++) {
							if (dealersCards.get(i).equals("2")) {
								dealersValue += 2;
							} else if (dealersCards.get(i).equals("3")) {
								dealersValue += 3;
							} else if (dealersCards.get(i).equals("4")) {
								dealersValue += 4;
							} else if (dealersCards.get(i).equals("5")) {
								dealersValue += 5;
							} else if (dealersCards.get(i).equals("6")) {
								dealersValue += 6;
							} else if (dealersCards.get(i).equals("7")) {
								dealersValue += 7;
							} else if (dealersCards.get(i).equals("8")) {
								dealersValue += 8;
							} else if (dealersCards.get(i).equals("9")) {
								dealersValue += 9;
							} else if (dealersCards.get(i).equals("10")) {
								dealersValue += 10;
							} else if (dealersCards.get(i).equals("Jack")) {
								dealersValue += 10;
							} else if (dealersCards.get(i).equals("Queen")) {
								dealersValue += 10;
							} else if (dealersCards.get(i).equals("King")) {
								dealersValue += 10;
							} else if (dealersCards.get(i).equals("Ace")) {
								dealersValue += 11;
							}
						}
						System.out.println("Dealers Cards Value: " + dealersValue + "\n");
					}
					// Checks dealersValue against usersValue Prints Response
					if (dealersValue == 17) {
						System.out.println("Dealer Has 17 - Dealer Sticks\n");
						y = 1;

						if (usersValue < 17) {
							System.out.println("You Have: " + usersValue + " You Lost");
						} else if (usersValue == dealersValue) {
							System.out.println("You Have: " + usersValue + " You Drew");
						} else {
							System.out.println("You Have: " + usersValue + " You Won!");
						}
					}
					if (dealersValue > 17 && dealersValue < 21) {
						System.out.println("Dealer Has: " + dealersValue + " Dealer Sticks\n");
						y = 1;
						if (usersValue < 18) {
							System.out.println("You Have: " + usersValue + " You Lost");
						} else if (usersValue == dealersValue) {
							System.out.println("You Have: " + usersValue + " You Drew");
						} else {
							System.out.println("You Have: " + usersValue + " You Won!");
						}
					}
					if (dealersValue == 21) {
						System.out.println("Dealer Has BlackJack\n");
						y = 1;
						if (usersValue == dealersValue) {
							System.out.println("You Have: " + usersValue + " You Drew");
						}
					}
					if (dealersValue > 21) {
						System.out.println("Dealer Has Busted - You Win!");
						y = 1;
					}
				}
				break;
			default:
				System.out.println("Not A Valid Selection");
			}

		}
	}
}
