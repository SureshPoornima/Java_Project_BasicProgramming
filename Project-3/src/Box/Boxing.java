package Box;

import java.util.Scanner;

public class Boxing {

	public static void main(String[] args) {
		int n,temp=0,eligible=0,m=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of players");
		n = in.nextInt();
		System.out.println("Enter the number of fouls made by each player");
		int a[] = new int [n];
		for(int i=0; i<n; i++)
		{
			a[i] = in.nextInt();
		}
		 for(int i=0; i<n; i++)
		 {
			
			 for(int j=i+1; j<n; j++)
			 {
				 if(a[i] < a[j])
				 {

					 temp = a[j];
					 a[j] = a[i];
					 a[i] = temp;
				  eligible = a[j];
				  m=j-1;
				 }
			 }
		 }
		 System.out.print("the eligible player no: "+ m );
		 System.out.print(" ");
		 System.out.print( eligible +"fouls");
		 }
		 }
		
	


