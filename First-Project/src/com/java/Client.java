package com.java;
import java.util.*;
 
public class Client
{
   public static void main(String args[])
   {/*
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 System.out.println("reverse"+reverse);
      if (original.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
   */
	  /*
	   String reverse = " ";
   System.out.println("This is Palindram Number Check Programme");

   Scanner sc=new Scanner(System.in);
   System.out.println("Please enter the input");
   String number=sc.nextLine();
   
   int actual=number.length();
   
   for(int a=actual-1;a>=0;a--)
   {
	   reverse= reverse + number.charAt(a);
	   
   }
   if(number.equals(reverse))
   {
	   System.out.println("palindram");
   }
   
   }*/

	   int n, reverse = 0;
	   
	      System.out.println("Enter the number to reverse");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	 
	      while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Revers of entered number is "+reverse);
	   float number=100;
	   System.out.println(number%100);
  
		   int i,m=0,flag=0;    
		   //int n=17;//it is the number to be checked  
		   m=n/2;    
		   for(i=2;i<=m;i++){ 
			   System.out.println(n%i);
		    if(n%i==0){    
		    System.out.println("Number is not prime");    
		    flag=1;    
		    break;    
		    }    
		   }    
		   if(flag==0)    
		   System.out.println("Number is prime");    
		 }  
		 
   
   }