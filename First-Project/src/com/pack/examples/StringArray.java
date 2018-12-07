package com.pack.examples;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

import com.pack.Employee;

public class StringArray {
	
	@Test
	public void sortObjects() {
	final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
	final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};
	
	Employee emp=new Employee("Joseph", "CHENNAI");
	Employee emp1=new Employee("Joseph1", "CHENNAI");
	Employee[] employee={emp,emp1};
	
	Arrays.sort(employee);
	assertArrayEquals(expected, strings);
	}

}
