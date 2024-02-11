//Program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.Scanner;
import java.lang.Math;
public class Question5_M1
{
	public static void main(String args[])
	{
		float a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Floating Point Number : ");
		a = sc.nextFloat();
		System.out.println("Enter An Other Floating Point Number : ");
		b = sc.nextFloat();
		float difference = Math.abs(a-b);
		if(difference <= 0.001)
		{
			System.out.println("The Numbers "+a+" And "+b+" Are Same");
		}
		else
		{
			System.out.println("The Numbers "+a+" And "+b+" Are Not Same");
		}
		sc.close();
	}
}