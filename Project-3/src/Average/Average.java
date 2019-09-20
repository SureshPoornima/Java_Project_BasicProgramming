package Average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int n,sum=0,avg;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of sunjects");
		n =in.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the marks");
		for(int i=0; i<n; i++)
		{
			a[i] = in.nextInt();
			sum=sum+a[i];
		}
		avg = sum/n;
		System.out.println("The average is "+avg);
		

	}

}
