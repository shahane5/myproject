package com.arrays;

public class Vowels {
	//WRONG

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String a= "Hardik";
  
	   int count=0;
	   String bbb ="";
	   for(int i=0;i<a.length();i++){
	   if(a.charAt(i)=='a'|| a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
	   count ++;
	     bbb=bbb+a.charAt(i)+1;
	   
		
	}

}System.out.println(count);
	}
}
