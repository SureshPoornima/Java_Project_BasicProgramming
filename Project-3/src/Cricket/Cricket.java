package Cricket;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		int n,count=0;
		float sum=0,total =0,over=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Bowlers");
		n = in.nextInt();
		System.out.println("Enter the runs conceded by the bowlers");
		int a[] = new int [n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
        System.out.println("Enter the number of balls for each bowler");
        int b[] = new int [n];
        for(int i=0; i<n; i++) {
        	b[i] = in.nextInt();
        }
        System.out.println("Economy of the bowlers is");
       
        float c[] = new float [5];
        for(int i=0;i<5;i++)
        {
        	over = b[i]/6;
        	c[i] = over;
        }
        float d[] = new float [5];
        for(int i=0; i<5; i++)
        {
        	d[i] = a[i]/ c[i];
        	sum = sum + d[i];
        	System.out.println(d[i]);
        	total = sum / n;
        	if (d[i] > total)
        	{
        		count = count + 1;
        	}
        }
        System.out.println("The overall economy of the teanm is "+total);
        	
        System.out.println("The number of bowlers eligible are "+count); 
        }
}


