package DesendingOrder;

import java.util.Scanner;

public class desendingOrder {

	public static void main(String[] args) {

				int n,temp;
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the number of students");
				n = in.nextInt();
				int a[] = new int [n];
				System.out.println("Enter the marks");
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
							 temp = a[j];
							 a[j] = a[i];
							 a[i] = temp;
						 }
					 }
				 }
				 System.out.println("The proirity of mark are");
				 for(int i=n-1; i>=0; i--)
				 {
					 System.out.println(a[i]);
				 }
			}

		


	}


