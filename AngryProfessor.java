package com.hackerrankandothers;

import java.util.Scanner;

public class AngryProfessor {
	/*
	 * A Discrete Mathematics professor has a class of students. Frustrated with
	 * their lack of discipline, the professor decides to cancel class if fewer than
	 * some number of students are present when class starts. Arrival times go from
	 * on time (t<=0) to arrived late (t>0).
	 * 
	 * Given the arrival time of each student and a threshhold number of attendees,
	 * determine if the class is cancelled
	 */
	public static String angerPro(int a[], int n) {
		int l = a.length, minus = 0;
		for (int i = 0; i < l; i++) {
			if (a[i] <= 0) {
				minus++;
			}
		}
		if (n <= minus)
			return "No";
		else
			return "Yes";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("uhi");
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int l = sc.nextInt();
			int n = sc.nextInt();
			int a[] = new int[l];
			for (int j = 0; j < l; j++) {
				a[0] = sc.nextInt();
			}
			String k = angerPro(a, n);
			System.out.println(k);

		}
		sc.close();
	}
}
/*
 * 10 10 4 -93 -86 49 -62 -90 -63 40 72 11 67 10 10 23 -35 -2 58 -67 -56 -42 -73
 * -19 37 10 9 13 91 56 -62 96 -5 -84 -36 -46 -13 10 8 45 67 64 -50 -8 78 84 -51
 * 99 60 10 7 26 94 -95 34 67 -97 17 52 1 86 10 2 19 29 -17 -71 -75 -27 -56 -53
 * 65 83 10 10 -32 -3 -70 8 -40 -96 -18 -46 -21 -79 10 9 -50 0 64 14 -56 -91 -65
 * -36 51 -28 10 6 -58 -29 -35 -18 43 -28 -76 43 -13 6 10 1 88 -17 -96 43 83 99
 * 25 90 -39 86
 */
/*
 * NO YES YES YES YES NO YES YES NO NO
 */