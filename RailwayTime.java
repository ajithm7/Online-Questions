package com.hackerrankandothers;

import java.util.Scanner;

public class RailwayTime {

	static String railTime(String str) {
		String time[] = str.split(":");
		String hour = time[0];
		String min = time[1];
		String secAmPm = time[2];
		String sec = secAmPm.substring(0, 2);// initial value consider & before final value
		String mer = secAmPm.substring(2);// it consider after the value we enter

		int hr = Integer.parseInt(hour);
		String railWayTime = "";

		if ((hr >= 0 && hr < 12) && mer.equals("AM")) {
			// string.equals()-it its used to check the string same or not to bracket one.
			railWayTime = hour + ":" + min + ":" + sec;
		} else if (hr < 12 && hr >= 0 && mer.equals("PM")) {
			int hrs = hr + 12;
			railWayTime = Integer.toString(hrs) + ":" + min + ":" + sec;
		} else if (hr == 12 && mer.equals("PM")) {
			railWayTime = Integer.toString(hr) + ":" + min + ":" + sec;
		} else if (hr == 12 && mer.equals("AM")) {

			railWayTime = "00" + ":" + min + ":" + sec;
		}
		return railWayTime;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr your -'hr:min:secAM/PM' - :");
		String str = sc.next();
		sc.close();
		System.out.println("Railway time is :    " + railTime(str));
	}
}
