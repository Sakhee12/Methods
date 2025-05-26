//A sunny number is a positive integer where the number immediately following it is a perfect square. In other words, if n is a 
//sunny number, then n + 1 must be a perfect square.

import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num=new Scanner(System.in).nextInt();
	    boolean flag = false;
		num+=1;
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
			/*
			if(i*i==num)
			{
				flag = true;
				System.out.println(i+" is a perfect sqaure root for "+" i.e it is a Sunny Number");
			}
			if(i*i>num)
				break;
		}
		if(!flag)
			System.out.println(num+" is not having a perfect square root "+" i.e it is not a Sunny Number");
		*/
		}
	}
}
