package com.hackerrankandothers;

import java.util.Scanner;

public class ReverseWordsInaGivenString {
	// i/p--> abc.sdt.hsb.isj
	// o/p--> isj.hsb.sdt.abc
	public void reverseWords(String s) {
		String temp = "";
		String[] arrStr = s.split("\\.");

		for (int i = arrStr.length - 1; i >= 0; i--) {
			if (i > 0) {
				temp += arrStr[i] + ".";
			} else {
				temp += arrStr[i];
			}
		}

		System.out.println(temp);
	}

	public static void main(String[] args) {
		ReverseWordsInaGivenString ob = new ReverseWordsInaGivenString();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ob.reverseWords(s);
		sc.close();
	}

}
