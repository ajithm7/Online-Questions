package com.hackerrankandothers;

import java.util.Scanner;

class BreakingTheRecords {

	/*
	 * Complete the 'breakingRecords' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY scores as parameter.
	 */

	public static void breakingRecords(int[] a) {

		int max = a[0];
		int min = a[0];
		int result[] = new int[2];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				result[0]++;

			}
			if (min > a[i]) {
				min = a[i];
				result[1]++;
			}

		}

		for (int i = 0; i < 2; i++) {

			System.out.print(result[i] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {

			scores[i] = sc.nextInt();
		}
		sc.close();
		breakingRecords(scores);
	}

}