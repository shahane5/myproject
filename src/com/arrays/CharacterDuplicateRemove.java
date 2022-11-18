package com.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CharacterDuplicateRemove {

	public static void main(String[] args) {
		String string1 = "Great responsibility";
		char string[] = string1.toCharArray();
	            //List<char[]>  = Arrays.asList(string);
		Set<Character>set=new LinkedHashSet();
	            for(int i=0;i<string.length;i++) {
	            	set.add(string[i]);
	            }System.out.println(set);
	}

}
