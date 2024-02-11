//Program to input 5 numbers from keyboard and find their sum and average.

import java.util.Scanner;

public class Question8_M1
{
	public static void main(String args[])
	{
		int a,b,c,d,e;
		float sum,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		sum = a + b + c + d + e;
		avg = sum/5;
		System.out.println("The Sum Is "+sum);
		System.out.println("The Average Is "+avg);
		sc.close();
	}
}