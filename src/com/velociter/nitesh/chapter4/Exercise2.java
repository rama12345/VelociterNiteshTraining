package com.velociter.nitesh.chapter4;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[12][12];
		// loop for rows from 1 to 12
		for (int row = 0; row <= table.length - 1; row++) {
			// loop for columns from 1 to 12
			// create the matrix of 12*12
			for (int column = 0; column <= table.length - 1; column++) {
				// fetch the row and column multiple in matrix
				table[row][column] = (row + 1) * (column + 1);
				// check the condition if less it with 10
				if (table[row][column] < 10)
					System.out.print("  " + table[row][column] + " ");
				// check the condition if grater it with 10 and less it with 100
				else if (table[row][column] > 10 && table[row][column] < 100)
					System.out.print(" " + table[row][column] + " ");
				else
					System.out.print(table[row][column] + " ");
			}
			System.out.println(" ");
		}
	}

}