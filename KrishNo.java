import java.util.Scanner;
class KrishNo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the NUmber: ");
		int num = new Scanner(System.in).nextInt();
		int dup=num;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;//123%10=3
			int fact= 1;
			for(int i=1; i<=rem ;i++)
				fact*=i;
			sum+=fact;
			num/=10;
		}
		
	    if(dup==sum)
			System.out.println("Krish No");
		else
			System.out.println("No");
		//System.out.println(dup==sum? "Krish Number":"Not Krish");
	}
		
		
}
