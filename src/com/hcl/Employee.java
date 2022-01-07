package com.hcl;

public class Employee {
	private String name;
	private int id;
	public static int count = 1;
	private String city;
	
	public Employee(String n, String c) {
		name = n;
		city = c;
		id = count;
		count++;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public int id() {
		return id;
	}
}
