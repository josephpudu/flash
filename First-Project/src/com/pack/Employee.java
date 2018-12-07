package com.pack;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1232323232L;
	public Employee(String empName, String empaAddress) {
		
		this.empName = empName;
		this.empaAddress = empaAddress;
	}

	private String empName;
	private String empaAddress;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpaAddress() {
		return empaAddress;
	}

	public void setEmpaAddress(String empaAddress) {
		this.empaAddress = empaAddress;
	}

}
