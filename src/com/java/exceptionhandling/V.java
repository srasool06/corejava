package com.java.exceptionhandling;

public class V {

	public static void main(String[]args ){
		System.out.println("statement one");
		
		try{
			System.out.println("statement two");
		
			int i=10/0;
			System.out.println("statement three");
		}catch(ArithmeticException ae){
			System.out.println("statement four");
			System.out.println(ae);
			int j=10/0;
			System.out.println(j);
			System.out.println("statement five");
		}
		System.out.println("statement six");
	}
}
