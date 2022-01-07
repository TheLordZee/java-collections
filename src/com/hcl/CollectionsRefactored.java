package com.hcl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsRefactored {
	public static void main(String[] args) {
		//Stores names
		List<Employee> employees = new ArrayList<>();
		
		Employee steve = new Employee("Steve", "New York City");
		Employee james = new Employee("James", "Houston");
		Employee bob = new Employee("Bob", "Nashville");
		Employee jill = new Employee("Jill", "New York City");
		Employee jack = new Employee("Jack", "Cary");
		
		employees.add(steve);
		employees.add(james);
		employees.add(bob);
		employees.add(jill);
		employees.add(jack);
		
		Set<String> cities = new HashSet<>();
		employees.forEach((e) -> cities.add(e.getCity()));
		
		cities.forEach((c) -> System.out.println(c));
		
		//Stores unique cities and how many times they occur 
		Map<String, Integer> counts = new HashMap<>();
		employees.forEach((e) -> {
				if(counts.get(e.getCity()) != null) {
					int newCount = counts.get(e.getCity()) + 1;
					counts.replace(e.getCity(), newCount);
				} else {
					counts.put(e.getCity(), 1);
				}
			}
		);
		
		counts.forEach((k, v) -> System.out.println(k + ": " + v));
	}
}