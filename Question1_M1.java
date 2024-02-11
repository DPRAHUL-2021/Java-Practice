// Program to read a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class Question1_M1
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number To Find Its Sign : ");
		num = sc.nextInt();
		if(num >= 0)
		{
			System.out.println("The Number "+num+" Is Positive");
		}
		else
		{
			System.out.println("The Number "+num+" Is Negative");
		}
		sc.close();
	}
}

