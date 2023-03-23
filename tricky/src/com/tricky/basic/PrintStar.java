package com.tricky.basic;

public class PrintStar {

	public static void main(String[] args) {
		for(int row =5; row>=1;row--) {
			for(int numberOfStars =1; numberOfStars<=row;numberOfStars++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
