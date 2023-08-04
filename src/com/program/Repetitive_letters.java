package com.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Repetitive_letters {

	public static void repeat(String s) {
		
		Map<Character, Integer> letter = new HashMap<Character,Integer>();
		
		char[] chars = s.toCharArray();
		
		for(char c : chars) {
			if(letter.containsKey(c)) {
				
				Integer no = letter.get(c);
				letter.put(c, no+1);
				
			}
			else {
				letter.put(c, 1);
			}
		}
		 Set<Entry<Character, Integer>> entryset = letter.entrySet();
			
			for (Entry<Character, Integer> entry : entryset) {
				
				if (entry.getValue()>1) {
					Character key = entry.getKey();
					Integer value = entry.getValue();
					System.out.println(key +"="+ value);
					
					
				}

			}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String s = sc.next();
		sc.close();
		
		repeat(s);
	}
}
