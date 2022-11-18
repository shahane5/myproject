package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemove {

	public static void main(String[] args) {
	Integer a[]= {10,20,30,10,20,50};
        
	List list=Arrays.asList(a);
	//System.out.println(list);
	  Set set= new HashSet();
	  for(Object i:list) {
		  set.add(i) ;
	  }
	System.out.println(set);
	for(int j=0;j<a.length;j++) {
		set.add(a[j]);
	}System.out.println(set);
	
	}

	
	
	
	
}
