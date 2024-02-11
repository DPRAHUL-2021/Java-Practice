//Program that creates a class Account that stores a variable balance. The class has methods to start account, to deposit money, to withdraw money and tell the current balance amount.

import java.util.Scanner;
public class question4_Mod2
{
	public static void main(String args[])
	{
		Account acc = new Account();
		acc.startAccount();
	}

	public static class Account
	{
		int balance = 120000;
		Scanner sc = new Scanner(System.in);
		int currentBalance;
		void startAccount()
		{
			System.out.println("Do you want to create an account : ");
			String ans = sc.next();
			ans = ans.toLowerCase();
			if(ans.equals("yes"))
			{
				System.out.println("Account Created");
				currentBalance = balance;
				System.out.println("The Balance In The Account Is = "+currentBalance);
				depositMoney(10000);
				withdrawMoney(5000);
				findCurrentBalance();
			}
			else
			{
				System.out.println("Account Not Created");
			}
		}
		void depositMoney(int money)
		{
			currentBalance+=money;
			System.out.println("Money Deposited");
		}
		void withdrawMoney(int price)
		{
			currentBalance-=price;
			System.out.println("Money Withdrawed");
		}
		void findCurrentBalance()
		{
			System.out.println("The Current Balance Of The Account Is  = "+currentBalance);
		}
		
	}

}