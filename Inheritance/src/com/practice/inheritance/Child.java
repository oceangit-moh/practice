package com.practice.inheritance;

import java.io.IOException;

public class Child extends Parent{
	public static void m1() throws IOException{
		System.out.println("Child");
	}
	
	public static void main(String[] args) throws Exception {
		Parent p = new Parent();
		p.m1();
		
		Parent pc = new Child();
		pc.m1();
		
		Child c = new Child();
		c.m1();
		
//		Child cp = new Parent();
//		cp.m1();
	}
}
