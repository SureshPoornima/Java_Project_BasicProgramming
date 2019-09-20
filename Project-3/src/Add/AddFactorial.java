package Add;

import java.util.Scanner;

public class AddFactorial {

	public static void main(String[] args) {
	int n,sum=0;
	Scanner in =  new Scanner(System.in);
	System.out.println("Enter a number");
	n = in.nextInt();
	for(int i=0;i<=n; i++)
	{
		sum=sum+i;
	}
  System.out.println("The sum is "+sum );
	}

}
