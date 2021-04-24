package com.cg.demos;

import java.util.HashSet;
import java.util.Set;

import com.cg.beans.Employee;

public class SetDemo2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001,20000,"ram");
		Employee e2 = new Employee(1003,50000,"tom");
		Employee e3 = new Employee(1007,70000,"sam");
		Employee e4 = new Employee(1002,10000,"ajay");
		Employee e5 = new Employee(1004,40000,"ajit");
		Employee e6 = new Employee(1001,20000,"ram");
		Employee e7 = e2;
		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		System.out.println(set.add(e6));
		System.out.println(set.add(e7));
		System.out.println(set.size());
		set.forEach(System.out :: println);
	}

}