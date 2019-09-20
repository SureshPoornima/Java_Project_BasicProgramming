package Fibinocci;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		int n,t1 = 0, t2 = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		for(int i=0; i<=n; i++)
		{
			System.out.print( t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

}
