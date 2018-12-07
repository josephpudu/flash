package com.java;



public class Employee {
	
	private String empName;
	private String empAddress;
	
	@Autowired
	private SoftwareEmployee sf;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
