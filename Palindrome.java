package com.hackerrankandothers;

import java.util.Scanner;

//check palindrome or not.
public class Palindrome {

	// Returning true if string is palindrome
	static boolean isPalindrome(String str) {

		int i = 0, j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		// Boolean method
		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");

		sc.close();
	}
}