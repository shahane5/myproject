package com.arrays;

import java.util.Comparator;

public class SalaryComparator  implements Comparator<Employee>{


	@Override
	public int compare(Employee employee1, Employee employee2) {
		if(employee1.id > employee2.id ){
			return -1; 
			
		}else if(employee1.id < employee2.id) {
			return +1;
			
		}else
	   return 0;
	}

}
