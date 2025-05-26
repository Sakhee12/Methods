import java.util.Scanner;
class SumOfFactorsOfNo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int fact=1;
		int sum=0;

		for(int i =num;i>=1;i--)
			fact*=i;
		System.out.println(fact);
		sum+=i;

		System.out.println(sum);
	}
}
