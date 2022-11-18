package com.arrays;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	public int compare(Employee employee1, Employee  employee2) {
		
		return employee2.city.compareTo(employee1.city);
	}


	

}
