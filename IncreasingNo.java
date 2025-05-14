import java.util.Scanner;
class IncreasingNo 
{
	public static void main(String[] args) 
	{
		System.out.println("ENTER THE NUMBER: ");
		int num = new Scanner(System.in).nextInt();
		int dup=num;
		int rem1=0;
		int rem2=0;
		
		while(num!=0)
		{
			rem1=num%10;
			num/=10;
			System.out.println(rem1);

			for(int i=num;i>0;i/=10)
			{
				rem2=i%10;
				i/=10;
				System.out.println(rem2);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(int i=num;i>100;i/=10)
		{
			 rem1 = i%10;
			 System.out.println(rem1);
			for(int j=dup;j>100;j/=10)
			{
				 rem2 = j%10;
				 System.out.println(rem2);
				
			}
			if(rem1>rem2)
				{
					System.out.println("YES");

				}
				else
				{
					System.out.println("NO");
				}
		}
		*/
	}
}
