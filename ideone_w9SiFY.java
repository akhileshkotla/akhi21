/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int i,y;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no of natural numbers");
	i=s.nextInt();
	y=i*(i+1)/2;
	System.out.println(y);
	}
}