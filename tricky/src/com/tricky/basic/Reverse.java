package com.tricky.basic;

public class Reverse {
	public static void main(String[] args) {
		int n=123;
		int reverse=0;
		
		while(n!=0) {
			reverse = reverse* 10; //0, 30, 320
			reverse = reverse + n%10; //3, 32, 
			n =n/10; //12, 1
		}
		System.out.println(reverse);
	}
}
