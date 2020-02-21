package com.epam.Interest_Calc;
import java.io.*;
import java.util.Scanner;

public class SI_CI {
	public static void main(String args[]) {
		PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner scan = new Scanner(System.in);
		try {
			print.println("Principal amount is: ");
			double principal = scan.nextDouble();
			print.println("Enter rate of Interest: ");
			double interestRate = scan.nextDouble();
			print.println("Time period: ");
			double time = scan.nextDouble();
			print.println("Simple Interest : " + ((principal * time * interestRate) / 100));
			print.println("Compound Interest : " + ((principal * Math.pow(1 + (interestRate / 100), time)) - principal));
		} catch (Exception e) {
			print.println("Invalid input");
		}
		scan.close();
	}

}