package com.bridgelabz.basicprograms;
import java.util.Scanner;
public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check if it is Leap year or not : ");
		int year = sc.nextInt();
		int check = String.valueOf(year).length();
		if (check==4) {
				if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
		            System.out.println(year + " year is leap year");
						}
				else {
		            System.out.println(year + " year is not leap year");
		        		}
				}
		else {
			System.err.println("Enter $ digit year input");
				}
	}

}
