//are numbers whose only prime factors are 2, 3 or 5.

import java.util.Scanner;
class UglyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
		int num = new Scanner(System.in).nextInt();
		int cnt = 0;
		
		if(num%2==0||num%3==0||num%5==0)
			System.out.println("is a ugly no");
		else
		{
			System.out.println("is not ugly no");
		}
				
	}
}
