package Retest;

import java.util.Scanner;

public class Retest {

	public static void main(String[] args) {
		int n,c=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n = in.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the marks");
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		for(int i=0; i<n; i++) 
		{
			if(a[i]<50)
			{
				c++;
			}
		}
		System.out.println("The number of students appearing for retest is  "+c);

	}

}
