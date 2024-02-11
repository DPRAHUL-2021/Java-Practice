//Take three numbers from the user and print the greatest number.

import java.util.Scanner;

public class Question3_M1
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		b = sc.nextInt();
		System.out.println("Enter Third Number : ");
		c = sc.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println("The Greatest Number Is "+a);
		}
		else if(c>=a && c>=b)
		{
			System.out.println("The Greatest Number Is "+c);
		}
		else
		{
			System.out.println("The Greatest Number Is "+b);
		}
		sc.close();
	}
}