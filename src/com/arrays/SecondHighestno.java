package com.arrays;

public class SecondHighestno {

	public static void main(String[] args) {
		
 int array[]= {20,45,45,85,25,10};
 int max=array[0];
 for(int i=0;i<array.length;i++) {
	 if(array[i]>max) {
		 max=array[i];
        		 
	 }
	 
 }System.out.println(max);
 
}
}

