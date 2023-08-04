package com.program;

import java.util.Scanner;

public class String_word_rev {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String sentence = sc.nextLine();
		sc.close();
		
		String words[] = sentence.split("\\s");
		String revsentence = "";
		
		for(int i=0;i<words.length;i++) {
			String first = words[i];
			String rev ="";
			for(int j=first.length()-1;j>=0;j--) {
				rev = rev + first.charAt(j);
			}
			
			revsentence = revsentence + rev + " ";
			
			
		}
		System.out.println("Original String :"+ sentence);
		System.out.println("Reversed String :"+ revsentence);
	}

}
