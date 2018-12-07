package com.java;

public class BubbleSort {

	public static void main(String[] args) {
		int[] n = { 9, 7, 10, 5 };
		bubbleSort(n);
		//System.out.println(n[0]);
for(int i=0;i<n.length;i++)
{
	System.out.println(n[i]);
}
	}

	static void bubbleSort(int[] args) {
		@SuppressWarnings("unused")
		int temp = 0;
		System.out.println("Before Sorting...");
		for (int i = 0; i < args.length; i++) {
			System.out.print(" "+args[i]);
			for (int j = 1; j < (args.length - i); j++) {
				
				if(args[j-1]>args[j])
				{
					temp=args[j-1];
					args[j-1]=args[j];
					args[j]=temp;
				}
				
			}
		}
	}
}
