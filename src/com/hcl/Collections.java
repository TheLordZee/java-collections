package com.hcl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Collections {
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
		for(Employee e: employees) {
			cities.add(e.getCity());
		}
		cities.forEach((c) -> System.out.println(c + " for each"));
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//Stores unique cities and how many times they occur 
		Map<String, Integer> counts = new HashMap<>();
		for(Employee e: employees) {
			if(counts.get(e.getCity()) != null) {
				int newCount = counts.get(e.getCity()) + 1;
				counts.replace(e.getCity(), newCount);
			} else {
				counts.put(e.getCity(), 1);
			}
		}
		
		counts.forEach((k, v) -> System.out.println(k + v + " for each"));
		
		for(Map.Entry<String, Integer> e : counts.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		
		
	}
}