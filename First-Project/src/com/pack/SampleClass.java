package com.pack;

import java.util.ArrayList;
import java.util.List;

public class SampleClass {
	
	public SampleClass() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public static void main(String[] args) {
		
		SampleClass s=new SampleClass();
		s.getDetails();
		MyLambda myLambda = () -> System.out.println("joseph display");
		myLambda.display();
		@SuppressWarnings("unused")
		MyAdd MyAddLambda = (a,b) -> a+b; 
	
	}
	
	private List<Employee> getDetails() {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("joseph", "Chennai"));
		empList.add(new Employee("joseph1", "Chennai1"));
		System.out.println(empList.toString());
		return empList;
		// TODO Auto-generated method stub

	}
	interface MyLambda
	{
		void display();
	}
	
	interface MyAdd
	{
		int add(int firstNumber, int secondNumber);
	}

}
