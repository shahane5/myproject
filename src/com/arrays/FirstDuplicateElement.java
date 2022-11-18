package com.arrays;

import java.util.HashSet;
import java.util.Set;
// wap to find first duplicate in array.
public class FirstDuplicateElement {

	public static void main(String[] args) {
		
     Integer a[]= {20,15,25,15,52,20};
     int temp=-1;
     Set<Integer> set=new HashSet<Integer>();
     for(int i=a.length-1;i>=0;i--) {
    	 if(set.contains(a[i])) {
    		 temp=i;
    	 }else {
    		 set.add(a[i]);
    	 }
    	 
     }if(temp!=-1) {
    	 System.out.println("the first duplicate element is "+ a[temp]);
     }else {
     
    	 System.out.println("the first duplicate element is not present");

	}System.out.println(set);
	}
}


