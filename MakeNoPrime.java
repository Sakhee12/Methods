import java.util.Scanner;
class MakeNoPrime 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int den = 2;
		while(den<num) 
        //while(den<=num/2)
        {
			if(num%den==0)
			{
				break;
			}
			den++;
        }
		if(num==den)
        //if(den>num/2)
		{
			System.out.println("is prime");
		}
		else
		{
				num++;
				den = 2;
				System.out.println(num);
			
		}

	}
}
