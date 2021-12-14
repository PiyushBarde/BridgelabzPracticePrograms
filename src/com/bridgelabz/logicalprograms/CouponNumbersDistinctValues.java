package com.bridgelabz.logicalprograms;
import java.util.Scanner;
import java.util.Random;
public class CouponNumbersDistinctValues {

	public static void main(String[] args) {
		int previousCoupon=0;
		Scanner sc = new Scanner(System.in);
		Random ranNumber = new Random();
		System.out.println("Enter the total numbers of Coupons u want = ");
		int number = sc.nextInt();
		for(int i=1; i<=number; i++) {
			int coupon = ranNumber.nextInt();
				if (coupon==previousCoupon) {
					continue;
				}
			previousCoupon= coupon;
			System.out.println(Math.abs(coupon));
		}
	}
}
