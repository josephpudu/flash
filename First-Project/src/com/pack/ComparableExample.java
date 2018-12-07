package com.pack;

import java.util.Arrays;

public class ComparableExample {
	
	private int stdRoolNumber;
	private String[] stdName;
	public int getStdRoolNumber() {
		return stdRoolNumber;
	}
	public void setStdRoolNumber(int stdRoolNumber) {
		this.stdRoolNumber = stdRoolNumber;
	}
	public String[] getStdName() {
		return stdName;
	}
	public void setStdName(String[] stdName) {
		stdName[0]="jos";
		stdName[1]="kos";
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "ComparableExample [stdRoolNumber=" + stdRoolNumber + ", stdName=" + Arrays.toString(stdName) + "]";
	}
	
	
	 public static void main(String[] args) {
		 
		
	}
	
	

}
