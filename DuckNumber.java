//a positive integer that has at least one zero in it, but not at the beginning

import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		String num=new Scanner(System.in).next();
		if(num.charAt(0)=='0')
			System.out.println("is not duck no");
		else
		{
			if(num.contains("0"))
				System.out.println("is a duck no");
			else
				System.out.println("is not a duck no");
		}
	}
}
