package com.velociter.nitesh.chapter15;

import java.util.Arrays;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char characterOfArray[] = {'a', 'b', 'c', 'd', 'e','f','g','h','i','j'};
        // To fill complete array with a particular
        Arrays.fill(characterOfArray, 'n');
        // converting character to string
        System.out.println("Array completely filled" +
                  " with 10\n" + Arrays.toString(characterOfArray));
	}

}
