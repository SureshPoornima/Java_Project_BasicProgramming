package Win;

import java.util.Scanner;

public class Winning {

	public static void main(String[] args) {
		int n,temp,bid=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of application");
		n = in.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the amount (in crore)");
		for(int i=0; i<n; i++) {
			a[i] =in.nextInt();
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
					 bid = a[j];
				 } 
			 }
		 }
		System.out.println("The winning bid is "+bid);

	}

}
