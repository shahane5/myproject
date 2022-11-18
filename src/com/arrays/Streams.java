package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Streams {

	public static void main(String[] args) {
		List<Employee>list= new ArrayList<Employee>();
	/*Map<Employee,String> map = new HashMap<Employee,String>();
		Employee emp=new Employee( 1, "ram", "pune");
		
		Employee emp2=new Employee( 2, "Bam", "pune");
		map.put(emp,emp.getName());
		System.out.println(map.get(emp));*/
		list.add(new Employee(1,"ram","pune"));
		System.out.println("enter the details");
		Employee emp=new Employee();
		
		Scanner s= new Scanner(System.in);
		System.out.println("eneter id");
		int id=s.nextInt();
		//emp.setId(id);
		System.out.println("enetr name");
		String name=s.next();
		//emp.setName(name);
		System.out.println("enter city");
		String city =s.next();
		//emp.setName(city);
	//	list.add(emp);
		
		list.add(new Employee(id, name, city));
	
		
		list.add(new Employee(3, "om", "nagar"));
		list.add(new Employee(2, "abhi", "mun"));
		
		
	Collections.sort(list, new SalaryComparator());
		for(Employee employee: list) {
			System.out.println("id >>"+employee.getId()+" name >>"+ employee.getName()+" city >>" + employee.getCity());
		}
	
	}
	

}
