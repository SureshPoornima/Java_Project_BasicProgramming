package Combination;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		int n,c=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of alphabets in your name ");
		n = in.nextInt();
		for(int i=1; i<=n; i++)
		{
			c=c*i;
		}
		System.out.println("The number of combination is "+c);

	}

}
