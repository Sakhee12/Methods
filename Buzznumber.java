// a number that is either divisible by seven or ends with seven

import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		int num=new Scanner(System.in).nextInt();
		if(num%10==7 ||num%7==0)
			System.out.println(" is a buzz number");
		else
			System.out.println(" is not a buzz number");
	}
}
