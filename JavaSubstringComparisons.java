package com.hackerrankandothers;

import java.util.Scanner;

public class JavaSubstringComparisons {/*
										 * We define the following terms:
										 * 
										 * Lexicographical Order, also known as alphabetic or dictionary order, orders
										 * characters as follows: For example, ball < cat, dog < dorm, Happy < happy,
										 * Zoo < ball.
										 * 
										 * A substring of a string is a contiguous block of characters in the string.
										 * For example, the substrings of abc are a, b, c, ab, bc, and abc. Given a
										 * string,s , and an integer,k, complete the function so that it finds the
										 * lexicographically smallest and largest substrings of length .
										 */

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		int n = s.length();

		String[] st = new String[n - (k - 1)];// welcometojava--->3

		for (int i = 0; i < n - (k - 1); i++) {
			int j = i + k;
			st[i] = s.substring(i, j);
			// System.out.println(st[i]);

		}
		// System.out.println();
		int temp = 0, l = 0;

		for (int i = 0; i < st.length - 1; i++) {

			String s1 = st[i];
			String s2 = st[i + 1];
			l = s1.compareTo(s2);
			// System.out.println(l);
			if (l > temp) {
				// System.out.println(st[i]);
				largest = st[i];
			}
			if (l > temp) {
				temp = l;
			}
		}

		int tem = 100, sm = 0;
		for (int i = 0; i < st.length; i++) {

			String s1 = st[i];
			String s2 = st[0];
			sm = s1.compareTo(s2);
			// System.out.println(sm);

			if (sm < tem) {
				// System.out.println(st[i]);
				smallest = st[i];
			}
			if (sm < tem) {
				tem = sm;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String : ");
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println("Smallest and Longest :");
		System.out.println(getSmallestAndLargest(s, k));
	}
}
