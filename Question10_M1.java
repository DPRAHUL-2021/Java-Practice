/*Program in Java to display the pattern like right angle triangle with a number.
    Input number of rows : 5
    Expected Output :
    1
    12
    123
    1234
    12345
*/

import java.util.Scanner;

public class Question10_M1
{
	public static void main(String args[])
	{
		int rows,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter The Number Of Rows Needed : ");
		rows = sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf("%d",j);
			}
			System.out.printf("\n");
		}
	}
}