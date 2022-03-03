package com.hackerrankandothers;

import java.io.*;
import java.util.Scanner;

class Camel {

	/*
	 * Complete the 'camelcase' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */

	public static int camelcase(String s) {
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				num += 1;
			}
		}
		return num;
	}

}

public class CamelCase {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int result = Camel.camelcase(s);
		System.out.println(result);

		sc.close();
	}
}