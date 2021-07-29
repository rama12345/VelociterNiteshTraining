package com.velociter.nitesh.chapter14.exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating HashMap object of type <String, String>
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		// get the key from user.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number Between(10-20) : ");
		int keyNumber = input.nextInt();
		// adding key-value pairs to HashMap object
		hashMap.put(10, "abhishek");
		hashMap.put(11, "ajith");
		hashMap.put(12, "alekhya");
		hashMap.put(13, "amani");
		hashMap.put(14, "aman");
		hashMap.put(15, "shuhbam");
		hashMap.put(16, "jhon");
		hashMap.put(17, "jim");
		hashMap.put(18, "jeky");
		hashMap.put(19, "stev");
		hashMap.put(20, "methu");
		// check the condition it will be contain entered key.
		if (hashMap.containsKey(keyNumber)) {
			// store key to Object of value
			Object value = hashMap.get(keyNumber);
			System.out.println("Key : " + keyNumber + "\t" + "Value : " + value);
		} else {
			System.out.println("Not Founded Any Pair With Key!!!!");
		}
	}

}
