package com.velociter.nitesh.chapter3;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (100 * Math.random() + 1);
		System.out.println("random no is:" + num);
		if (num % 2 != 0) {
			num = (int) Math.sqrt(num);
			System.out.println("Prime no.square root is" + num);
		} else {
			System.out.println(" its Not not prime No.square root" + num);
		}
	}
}
