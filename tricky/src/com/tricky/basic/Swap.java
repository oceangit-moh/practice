package com.tricky.basic;

public class Swap {

	public static void main(String[] args) {
		int x=5;
		int y=6;
		int temp;
		
//		temp=x; //temp=5
//		x=y;	//x=6
//		y=temp; //y=5
		
		x= x+y; //11
		y= x-y; //5
		x= x-y; //6
		
		System.out.println("x: "+x+" y: "+y);
	}

}
