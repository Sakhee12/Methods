import java.util.Scanner;
class SumInWhile 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a Number:");
		int num = new Scanner(System.in)//123
		int dup = num;
		int sum = 0;

		while(num>0)
		{

			int rem = num%10;
			sum += rem;
			num/=10;

			System.out.println(sum);
	}
}
