package Tollgate;

import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
		int n,c=0,m=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of vehicle");
		n = in.nextInt();
		System.out.println("Enter the fare collected for each vehicle");
		int a[] = new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]= in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>50)
			{
				c=c+1;
			}
			else
			{
				m=m+1;
			}
		}
		System.out.print("Number of heavy vehicles "+c);
		System.out.print(" and the number of light weight vehicles is "+m);
		

	}

}
