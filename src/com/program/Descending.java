package com.program;

public class Descending {
	public static void main(String[] args) {
		
		int a=0;
		
		int arr[] = new int[] {98,45,3,75,23,12,86,58,7,35};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					a =arr[i];
					arr[i]=arr[j];
					arr[j]=a;
					
				}
			}
			System.out.println(arr[i]);
		}
	}

}


