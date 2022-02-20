package Pck1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String str=sc.next();

		String rev="";
		sc.close();


		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}

		System.out.println("Reversed string is: "+rev);

		
		if(str.equalsIgnoreCase(rev))
			System.out.println("Enterted string is palindrome");
		else
			System.out.println("Entered string is not a palindrome");
		
		
	}

}
