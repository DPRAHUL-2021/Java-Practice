//Program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday

import java.util.Scanner;
public class Question4_M1
{
	public static void main(String args[])
	{
		int num;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter A Number From 1 - 7 To Find The Day : ");
		num = sc.nextInt();
		switch(num)
		{
			case 1:
				System.out.println("It's A Sunday");
				break;
			case 2:
				System.out.println("It's A Monday");
				break;
			case 3:
				System.out.println("It's A Tuesday");
				break;
			case 4:
				System.out.println("It's A Wednesday");
				break;
			case 5:
				System.out.println("It's A Thursday");
				break;
			case 6:
				System.out.println("It's A Friday");
				break;
			case 7:
				System.out.println("It's A Saturday");
				break;
			default :
				System.out.println("You Have Entered A Wrong Number");
		}
		sc.close();
	}
}