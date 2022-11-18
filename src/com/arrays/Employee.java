package com.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
///Sorting customised
	 int id;
	 String name;
	 String city;
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		}
	
	public Employee() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		// Employee  employee = new  Employee(1,"naru","pune");
		 List<Employee>list= new ArrayList<Employee>();

			list.add(new Employee(3, "om", "nagar"));
			list.add(new Employee(2, "abhi", "mun"));
			list.add(new Employee(1,"ram","pune"));
		 list.stream().filter(x-> x.getCity()=="pune").collect(Collectors.toList()).forEach(x-> System.out.println(x));
	
	
	
	
}
}
