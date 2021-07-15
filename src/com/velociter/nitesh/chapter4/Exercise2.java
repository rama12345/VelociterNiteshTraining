package com.velociter.nitesh.chapter4;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[12][12];
		for (int row = 0; row <= table.length - 1; row++) {
			for (int column = 0; column <= table.length - 1; column++) {
				table[row][column] = (row + 1) * (column + 1);
				if (table[row][column] < 10)
					System.out.print("  " + table[row][column] + " ");
				else if (table[row][column] > 10 && table[row][column] < 100)
					System.out.print(" " + table[row][column] + " ");
				else
					System.out.print(table[row][column] + " ");
			}
			System.out.println(" ");
		}
	}

}