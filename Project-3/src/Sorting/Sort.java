package Sorting;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int n,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n = in.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
		  a[i] = in.nextInt();
		}
		
		 for(int i=0; i<n; i++)
		 {
			 for(int j=i+1; j<n; j++)
			 {
				 if(a[i] > a[j])
				 {
					 temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
			 }
		 }
		 System.out.println("The heights in order are");
		 for(int i=0; i<n-1; i++)
		 {
			 System.out.println(a[i]);
		 }
		System.out.println(a[n-1]);
	}

}
