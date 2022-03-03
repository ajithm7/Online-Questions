package com.hackerrankandothers;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
	
	   public static void titleToNumber(String s) {
			 int temp = 0; 
			 for (int i = 0; i <s.length(); i++) { 
				 int val = (int) s.charAt(i);
				 temp = (temp * 26) + (val- 64); }
			  
			  System.out.println(temp);  
		    }
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("your character must be in upper class"); String
		  chr=sc.nextLine(); 
		 sc.close(); 
		 titleToNumber(chr);
	

	}

}
