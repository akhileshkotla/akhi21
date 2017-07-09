/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x1,x2,x3;
	Scanner s=new Scanner(System.in);
	System.out.println("enter values");
	x1=s.nextInt();
	x2=s.nextInt();
	x3=s.nextInt();
	if(x1>x2)
	{
		if(x1>x3)
		{
			System.out.println(" greatest no is"+x1);
		}
		else{
			System.out.println("  greatest no is "+x3);
		}
	}
	else
	{
		if(x2>x3)
		{
			System.out.println(" greatest no is"+x2);
		}
		else
		{
			System.out.println(" greatest no is"+x3);
		}
	}
	}	
}