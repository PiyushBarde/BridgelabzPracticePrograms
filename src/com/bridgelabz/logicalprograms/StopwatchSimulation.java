package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class StopwatchSimulation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 to start the stopwatch = ");
		int initialTime = sc.nextInt();
		long startTime = 0;
		long stopTime = 0;
			if(initialTime==0) {
				startTime = System.currentTimeMillis();
				System.out.println("Starting time = " + startTime);
			}
			else {
				System.err.println("Enter valid input");
			}
		System.out.println("Enter 1 to stop the stopwatch = ");
		int finalTime = sc.nextInt();
			if(finalTime==1) {
				stopTime = System.currentTimeMillis();
				System.out.println("Stoppage time = " + stopTime);
			}
			else {
				System.err.println("Enter valid input");
			}
		long elapsedTime = stopTime - startTime;
		double secondsElapsedTime = (stopTime-startTime)/1000;
		System.out.println("the elapsed time is " + elapsedTime + " miliseconds & "+ secondsElapsedTime + "seconds");
	}
}




