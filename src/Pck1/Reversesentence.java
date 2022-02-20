package Pck1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Reversesentence 
{
	/*static String reverseString(String get)
	{
		Pattern pat=Pattern.compile("\\s");
		String temp[]=pat.split(get);
		String res="";

		for(int i=0;i<temp.length;i++)
		{
			if(i==temp.length-1)
			res=temp[i]+res;
			else
			res=" "+temp[i]+res;
		}

		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.next();
		sc.close();

		System.out.println(reverseString(str));
	}*/


	public static void main(String[] args)
	{

		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String s1=sc.next();
		sc.close();*/

		String s2="This is bosch";
		String res="";
		String[] sp=s2.split(" ");

		for(int i=sp.length-1;i>=0;i--)
		{
			res=res+sp[i]+" ";
		}
		System.out.println(res);
	}

}
