package com.hackerrankandothers;

import java.io.*;

import java.util.*;

public class BeautifulDaysatTheMovies {
	/*
	 * Complete the 'beautifulDays' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER i 2. INTEGER j 3. INTEGER k
	 */

	public static void beautifulDays(int i, int j, int k) {
		int t = 3, b[], a[];
		b = new int[] { i, j, k };
		a = new int[] { i, j, k };

		for (int n = 0; n < t; n++) {
			System.out.println(a[n]);
			int temp = 0;
			while (a[n] != 0) {
				temp *= 10;
				temp += a[n] % 10;
				a[n] /= 10;
			}
			a[n] = temp;
			System.out.println(a[n]);
		}
		int count = 0;

		for (int n = 0; n < t; n++) {
			int f = 0;
			f = b[n] - a[n];
			System.out.println(f);

			f = f % 6;
			System.out.println(f);
			if (f != 0) {
				++count;
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("kjhici");
		int i = sc.nextInt();

		int j = sc.nextInt();

		int k = sc.nextInt();

		beautifulDays(i, j, k);
		sc.close();
		// System.out.println(result);

	}
}