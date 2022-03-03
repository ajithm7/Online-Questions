package com.hackerrankandothers;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingValleys {
	static void countingValleys(ArrayList<Character> a, long n) {

		long sumU = 0;/*
						 * 8 UDDDUDUU
						 */
		for (int i = 0; i < n; i++) {
			if (a.get(i) == 'U') {
				sumU++;
			} else if (a.get(i) == 'D') {
				sumU--;
			}

		}

		System.out.println(Math.abs(sumU));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("");
		long n = sc.nextLong();
		String s = new String();
		s = sc.next();
		char[] c = s.toCharArray();
		ArrayList<Character> a = new ArrayList<Character>();
		for (int i = 0; i < n; i++) {
			a.add(c[i]);
			// System.out.println(c[i]);
		}
		countingValleys(a, n);
		sc.close();
	}

}
