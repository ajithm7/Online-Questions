package com.hackerrankandothers;

import java.util.Scanner;

// Different types of switch case
public class SwitchDiffTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week day start with upper case");
		String day = sc.next();

		// switch with (:)
		switch (day) {
		case "Monday":
			System.out.println("day1");
			break;
		case "Tuesday":
			System.out.println("day2");
			break;
		case "Wednesday":
			System.out.println("day3");
			break;
		case "Thursday":
			System.out.println("day4");
			break;
		case "Friday":
			System.out.println("day5");
			break;
		default:
			System.out.println("Not in list");
		}

		// switch with (->)
		switch (day) {
		case "Monday" -> System.out.println("day1");

		case "Tuesday" -> System.out.println("day2");

		case "Wednesday" -> System.out.println("day3");

		case "Thursday" -> System.out.println("day4");

		case "Friday" -> System.out.println("day5");

		default -> System.out.println("Not in list");
		}

		// switch with multiple cases in (:)
		switch (day) {
		case "Monday", "Tuesday":
			System.out.println("day1 or day2");
			break;

		case "Wednesday", "Thursday":
			System.out.println("day3 Or day4");
			break;

		case "Friday":
			System.out.println("day5");
			break;
		default:
			System.out.println("Not in list");
		}

		// switch with multiple cases in (->)
		switch (day) {
		case "Monday", "Tuesday" -> System.out.println("day1 or day2");

		case "Wednesday", "Thursday" -> System.out.println("day3 Or day4");

		case "Friday" -> System.out.println("day5");

		default -> System.out.println("Not in list");
		}
		sc.close();
	}

}
