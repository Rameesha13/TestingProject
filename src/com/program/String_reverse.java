package com.program;

import java.util.Scanner;

public class String_reverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String sentence = sc.nextLine();
		sc.close();
		String revsentence = "";
		
		for(int i=sentence.length()-1;i>=0;i--) {
			
			revsentence = revsentence + sentence.charAt(i);
			
		}
		System.out.println("Original String :"+ sentence);
		System.out.println("Reversed String :"+ revsentence);
	}
    
}   
