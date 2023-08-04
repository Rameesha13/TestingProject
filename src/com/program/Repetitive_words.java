package com.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Repetitive_words {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String s = sc.next();
		sc.close();
		
		String[] words = s.split(" ");
		
		Map<String, Integer> word = new HashMap<String, Integer>();
		
		
		for (String string : words) {
			
			if (word.containsKey(string)) {
				
				Integer it = word.get(string);
				word.put(string, it+1);
				
			}else {
				word.put(string, 1);
			}
			
		}
		
		
		System.out.println("List of duplicate word");
		
      Set<Entry<String, Integer>> entryset = word.entrySet();
		
		for (Entry<String, Integer> entry : entryset) {
			
			if (entry.getValue()>1) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key +"="+ value);
				
				
			}
			
		}
}
}
