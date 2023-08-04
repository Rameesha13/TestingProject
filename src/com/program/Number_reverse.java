package com.program;

import java.util.Scanner;

public class Number_reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no:");
		int no =sc.nextInt();
		sc.close();
		int reverse =0;
		
		for (;no!=0;no=no/10) {
			int rem = no%10;
			reverse = reverse *10+rem;
			
		}
		System.out.println("Reverse no is:" +reverse);
	}
}
