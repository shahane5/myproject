package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		
		System.out.println(" Enter the size of array ");
		Scanner s=new Scanner(System.in);
        Integer size= s.nextInt();
	Integer  a[]= new Integer [size];
		System.out.println("enter the elements of array");
		for(Integer i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		    List <Integer> list = Arrays.asList(a);
		   list.stream().filter(x->x % 2==0).forEach(System.out::println);
				   //collect(Collectors.toList());
				//System.out.println(l);
		    
		
	}

}
