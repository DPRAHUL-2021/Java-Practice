//Program to solve quadratic equations (use if, else if and else).
import java.util.Scanner;
import java.lang.Math;

public class Question2_M1
{
	public static void main(String args[])
	{
		// Ax^2 + Bx + C is the equation which we are considering
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of A : ");
		a = sc.nextInt();
		System.out.println("Enter The Value Of B : ");
		b = sc.nextInt();
		System.out.println("Enter The Value Of C : ");
		c = sc.nextInt();
		float Disc,root1,root2;
		Disc = (float) Math.sqrt((b*b) - (4*a*c));
		if(Disc > 0)
		{
			System.out.println("The Roots Are Real And Distinct");
			root1 = (-b + Disc)/(2*a);
			root2 = (-b - Disc)/(2*a);
		}
		else if(Disc == 0)
		{
			System.out.println("The Roots Are Equal");
			root1 = root2 = (-b)/(2*a);
		}
		else
		{
			System.out.println("The Roots Are Imaginary");
			root1 = (-b + Disc)/(2*a);
			root2 = (-b - Disc)/(2*a);
			System.out.println("NaN = Not A Number");
		}
		System.out.println("Therefore , The Roots Of The Equation Are : ("+root1+","+root2+")");
		sc.close();
	}
}