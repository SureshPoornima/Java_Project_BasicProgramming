package Leap;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year");
		n = in.nextInt();
		if(n%4==0 && n%100==0) {
			if(n%400==0)
		{
			System.out.println("It is a Leap year");
		}
		else
		{
			System.out.println("It is not a Leap year");
		}
		}

	}

}
