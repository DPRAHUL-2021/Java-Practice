//Program in Java to display the multiplication table of a given integer.

import java.util.Scanner;

public class Question9_M1
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number To Find Its Table : ");
		n = sc.nextInt();
		System.out.println("The Multiplication Table Of "+n);
		for(i = 1  ;  i<=10 ; i++)
		{
//			System.out.println(n+" x "+i+" = "+n*i);
			System.out.printf("%d x %d = %d\n",n,i,n*i);
		}
		sc.close();
	}
}