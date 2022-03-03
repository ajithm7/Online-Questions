package com.hackerrankandothers;

import java.util.*;

public class DivisibleSumPairs {
	/*
	 * Complete the 'divisibleSumPairs' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER k 3. INTEGER_ARRAY ar
	 */

	public static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		for (int j = 0; j < n; j++) {
			for (int i = j + 1; i < ar.length; i++) {
				int f = 0;
				f = (ar[j] + ar[i]) % k;
				if (f == 0) {
					count++;
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int k = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println(divisibleSumPairs(n, k, ar));
		sc.close();
	}
}