package NCR;

import java.util.Scanner;

public class Ncr {

	public static void main(String[] args) {
		int n,r,fact=1,fact1=1,ncr=0,diff,fact2=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value for n");
		n = in.nextInt();
		System.out.println("Enter the value for r");
		r = in.nextInt();
		diff=n-r;
		for(int k=1;k<=diff;k++)
		{
			fact2=fact2*k;
		}
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		for(int j=1;j<=r;j++)
		{
			fact1=fact1*j;
		}
     ncr=fact/(fact1*fact2);
     System.out.println("The NCR factor for given number is "+ncr);
	}

}
