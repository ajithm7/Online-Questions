package com.hackerrankandothers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BillDivision {// 4 1 //3 10 2 9 //7 // o/p==> Bon Appetit
	// 4 1 //3 10 2 9 //12 // o/p===> 5
	// System.out.println(big);

	static void billDivision(ArrayList<Long> a, long n, long l, int k) {

		Collections.sort(a);
		long total = a.get(0);
		for (int i = 1; i < n; i++) {
			total = total + a.get(i);
		}
		long tempTotal = 0;
		Collections.sort(a, Collections.reverseOrder());
		for (int j = 0; j < k; j++) {
			tempTotal += a.get(j);

		}
		// System.out.println(tempTotal);
		long result = (total - tempTotal) % 2;
		if (result == 0) {
			result = (total - tempTotal) / 2;
			if (result != l) {
				System.out.println(l - result);
			} else {
				System.out.println("Bon Appetit");
			}
		} else
			System.out.println("Bon Appetit");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		long n = sc.nextLong();
		int k = sc.nextInt();
		ArrayList<Long> a = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextLong());
		}
		long l = sc.nextInt();
		billDivision(a, n, l, k);
		sc.close();
	}
}
