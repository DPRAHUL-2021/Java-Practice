//Program that takes a year from user and print whether that year is a leap year or not

import java.util.Scanner;

public class Question6_M1
{
	public static void main(String args[])
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An Year To Find Whether It Is A Leap Year Or Not : ");
		year = sc.nextInt();
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) )
		{
			System.out.println("Yes, "+year+" Is A Leap Year");
		}
		else
		{
			System.out.println("No, "+year+" Is Not A Leap Year");
		}
		sc.close();
	}
}