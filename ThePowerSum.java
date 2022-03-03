package com.hackerrankandothers;

import java.io.*;

import java.util.*;

public class ThePowerSum {

	/*
	 * Complete the 'powerSum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER X 2. INTEGER N
	 */

	public static int powerSum(int X, int N) {
		int temp = 0, val = 0;
		if (X == 0)
			return 0;
		else {
			temp = X % 10;
			X = X / 10;
		}
		val = (int) Math.pow(temp, N);
		return val + powerSum(X, N);

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int N = sc.nextInt();

		double n = powerSum(X, N);
		System.out.println(n);
		sc.close();
	}

}
