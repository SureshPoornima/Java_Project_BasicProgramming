package Gold;

import java.util.Scanner;

public class Gold {

	public static void main(String[] args) {
		int n,count=0,num=0,tot=0,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		n = in.nextInt();
	    count = n/5;
	    tot=count/5;
	    sum= n + count+ tot;
		System.out.println("Number of Sculptors can be made is "+sum);
		
	}

}
