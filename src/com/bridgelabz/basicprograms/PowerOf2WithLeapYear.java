package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class PowerOf2WithLeapYear {

	static int leap(int subInput) {
        if ((subInput % 4) == 0 && (subInput % 100) != 0 || (subInput % 400) == 0) {
                System.out.println(subInput + " year is leap year");
        }
        else {
                System.out.println(subInput + " year is not leap year");
            }
        return(0);
        }




    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the Nth power of 2 to print");
        int power = 1;
        int input = number.nextInt();
        if (input >= 1 && input <= 31) {
            System.out.println("Table for " + input + "th power of two");
            for (int i = 1; i <= input; i++) {
                power = power * 2;
                System.out.println(power);
            }
        }
        else if(input==0) {
            System.out.println("Power is : 0");
        }
        else {
            System.err.println("Enter valid input from 0 to 31");
        }

        //for leap year

        leap(power);

    }
}