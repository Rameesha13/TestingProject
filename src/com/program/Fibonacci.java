package com.program;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :" );
		int no =sc.nextInt();
		
		int a = 0,b=1;
		
		System.out.print(a+" "+b);
		for(int i=2;i<no;i++) {
		
			int c = a+b;
			a = b;
			b = c;
			System.out.print(" "+c); 
		}
		sc.close();
	}

}
