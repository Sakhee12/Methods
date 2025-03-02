import java.util.Scanner;
class NeonNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No: ");
		int num = sc.nextInt();

		System.out.println(sum(num)==num?("is a neon number"):("is not a neon number"));

	}

	public static int sum(int num)
	{
		int sum=0;
		int square=num*num;
		for(int i=square;i>0;i/=10)
		{
			//System.out.println(i);
			int rem=i%10;
			sum+=rem;
		}
		return sum;
	}
}
