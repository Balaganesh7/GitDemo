package Pck1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int n1=0,n2=1;
		int n3;
		
		System.out.println("Enter the count value: ");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		sc.close();
		
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
