package Pck1;

public class ParentClass 
{

	public static void main(String[] args) 
	{		
		int a=1;
		int b=2;
		int sum=a+b;
		System.out.println("The total value of c is \n"+sum);
		
		ChildClass c=new ChildClass();
		System.out.println(c.LaunchChrome());
		
	}

}
