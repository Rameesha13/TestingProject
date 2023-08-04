package com.program;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class Read_FileCount {
	
	public static void main(String[] args) throws IOException {
		
	
	File read = new File("C:\\Users\\sh\\Downloads\\File.txt");
	
	String s = FileUtils.readFileToString(read);
	
	String[] split = s.split(" ");
	
	Map<String, Integer> map = new LinkedHashMap<String , Integer>();
	
	for (String string : split) {
		
		if(map.containsKey(string)) {
			
			Integer count = map.get(string);
			
			count++;
			
			map.put(string, count);
			
		}
		else {
			map.put(string, 1);
		}
	}

	}
}
