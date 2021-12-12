package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class WindChill {
	static double windChill(double subTemperature, double subSpeed) {
		double effectiveTemperature = 35.74 + (0.6215 * subTemperature) + (((0.4275*subTemperature)-35.75) * Math.pow(subSpeed, 0.16));
		return(effectiveTemperature);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature t (in Fahrenheit) : "
				+ "\n (temperature must be less than 50)");
		double temperature = sc.nextDouble();
		if(temperature>50) {
			System.err.println("Run the program again & Enter temperature less than 50");
			System.exit(0);
		}
		System.out.println("Enter the wind speed v (in miles per hour) : "
				+ "(wind speed must be more than 3 and less than 120)");
		double speed = sc.nextDouble();
		if(speed<3 || speed>120) {
			System.err.println("Run the program again & Enter wind speed more than 3 and less than 120");
		}
		System.out.println("Wind chill = " + windChill(temperature,speed));
	}

}
