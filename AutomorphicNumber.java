//a natural number whose square ends in the same digits as the number itself.


import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int div =1;
		int len=0;
		for(int i=num;i>0;i/=10)
		{
			len++;
		}
		for(int i=1;i<=len;i++)
			div *= 10;

		if(num ==(num*num)%div)
			System.out.println(num+"is a Automorphic Number");
		else
			System.out.println(num+"is not a Automorphic Number");
	}
}
