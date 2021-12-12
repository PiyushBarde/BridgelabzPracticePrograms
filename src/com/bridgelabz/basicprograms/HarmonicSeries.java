package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class HarmonicSeries {

	static void series(int num1) {
        System.out.print("harmonic Series = ");
        for (int i = 1; i <= num1; i++) {
            if (i == num1) {
                System.out.print("1/" + i);
            } else {
                System.out.print("1/" + i + " + ");
            }
        }
    }

    static double value(int num2) {
        double harmonic = 0;
        for (int j = 1; j <= num2; j++) {
            harmonic = harmonic + (double)1/j;
        }
    return harmonic;
    }

    public static void main(String[] args) {
        Scanner NumberInput = new Scanner(System.in);
        System.out.println("Enter the Nth term for harmonic series : ");
        int n =  NumberInput.nextInt();
        series(n);
        System.out.println("\n"+ n + "th value of harmonic series is :" + value(n));
    }
}
