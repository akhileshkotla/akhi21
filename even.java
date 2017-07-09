/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value");
		x=s.nextInt();
		if (x%2==1)
		{
			System.out.println("odd");
	}
	else
	{
		System.out.println("even");
	}
}
}