package Divisor;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		int n,sum=0,m=0;
		Scanner in = new Scanner(System.in);
		System.out .println("Enter a number");
		n = in.nextInt();
		//int a[] = new int [n];
		System.out.print("The divisors of the given number are ");
		for (int i=1;i<n; i++)
		{
			
			if(n % i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;	
			
			}
		}
		//System.out.println ("the divisors of the given number are"+);
		if(sum==n)
		{
			System.out.println(" ");
			System.out.println("The sum of the divisors are "+sum);
		System.out.println("It is a perfect number");	
		}

	}

}
