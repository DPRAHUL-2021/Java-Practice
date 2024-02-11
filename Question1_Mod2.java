//Program to read two numbers and perform the arithmetic operations using methods

import java.util.Scanner;

class arithmetic{
	void sum(int a , int b)
	{
		System.out.println("The Sum Is : "+(a+b));
	}
	
	void multiply(int a , int b)
	{
		System.out.println("The Multiplication Is : "+(a*b));
	}
	
	void division(int a , int b)
	{
		System.out.println("The Division Is : "+(a/b));
	}
	
	void subtraction(int a , int b)
	{
		System.out.println("The Difference Is : "+(a-b));
	}

	void modulo(int a,int b)
	{
		System.out.println("The Modulo Is : "+(a%b));
	}
	
}


public class Question1_Mod2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter The Value Of A : \n");
		int a = sc.nextInt();
		System.out.printf("Enter The Value Of B : \n");
		int b = sc.nextInt();
		arithmetic ar = new arithmetic();
		ar.division(a,b);
		ar.sum(a,b);
		ar.subtraction(a,b);
		ar.multiply(a,b);
		ar.modulo(a,b);
		sc.close();
	}
}