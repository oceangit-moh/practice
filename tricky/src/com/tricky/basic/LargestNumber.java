package com.tricky.basic;

import java.util.ArrayList;

public class LargestNumber {
	public static void main(String[] args) {
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(3);
		intArr.add(5);
		intArr.add(6);
		intArr.add(1);
		intArr.add(9);
		int largest = intArr.get(0); 
		for(int i = 1; i < intArr.size(); i++ ) {
			Integer currentNumber = intArr.get(i);
			if(currentNumber>largest) // 1. 3>3 , 5>3, 6>5, 1
			{
				largest=currentNumber; //1.5, 6, 
		}
			
	}
		System.out.println("Largest Number: " + largest);
}
}