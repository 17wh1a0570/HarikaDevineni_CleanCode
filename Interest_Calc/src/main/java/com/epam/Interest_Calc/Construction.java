package com.epam.Interest_Calc;
import java.io.*;
import java.util.Scanner;

public class Construction {
		public static void cons() {
			PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
			Scanner scan = new Scanner(System.in);
			p.println("Select the Material: ");
			p.println("1.Standard Materials");
			p.println("2.Above Standard Materials");
			p.println("3.High Standard Materials");
			p.println("4.High Standard Materials and Fully Automated home");
			try {
				int ch = scan.nextInt();
				double house_area, total_cost = -1;
				p.println("Enter area of the house");
				house_area = scan.nextDouble();
				scan.close();
				switch(ch) {
				case 1:
					total_cost = 1200 * house_area;
					break;
				case 2:
					total_cost = 1500 * house_area;
					break;				
				case 3:
					total_cost = 1800 * house_area;
					break;
				case 4:
					total_cost = 2500 * house_area;
					break;
				default:
					p.println("Select from 1-4");
				}
				if (total_cost != -1) p.println("Cost of building the house in rupees is : " + total_cost);
			} catch (Exception e) {
				p.println("Please enter a valid input");
			}
		}
	}