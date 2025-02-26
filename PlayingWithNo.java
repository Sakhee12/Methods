import java.util.Scanner;
class PlayingWithNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		System.out.print("Enter the power: ");
		int pow = sc.nextInt();;
		System.out.println();
		
		prime(num);
		power(num,pow);
		factroial(num);
		sum(num);
		reverse(num);
		evenOdd(num);
		squareRoot(num);
		
	}


	public static void prime(int num)
	{
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
			System.out.println(num+" IS A PRIME NO");
		}
		else
		{
			System.out.println(num+" IS NOT PRIME");
		}
		System.out.println();
		
	}


	public static void power(int num,int pow)
	{
		    int op = 1;

		    for(int i =1;i<=pow;i++)
			   op*=num;

		    System.out.println(num+"^"+pow+" = "+op);
			System.out.println();
	}

	public static void factroial(int num)
	{
		int fact = 1;
		 
        for(int i = 1;i<=num;i++)
			fact *= i;
		System.out.println("FACTROIAL OF "+num+" IS "+fact);
		System.out.println();
	}
	

	public static void sum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("THE SUM OF DIGITS OF "+num+" IS "+sum);
		System.out.println();
	}

	public static void reverse(int num)
	{
		int rev=0;
		for(int i=num;i>0;i/=10)
		{
			int rem=i%10;
			rev =rev*10+rem;
		}
		System.out.println("THE REVERSE NO OF "+num+" IS "+rev);
		System.out.println((num==rev)?(" THE NUM IS PALLINDROME"):("THE NUM IS NOT PALLINDROME"));
		System.out.println("");
	}
	
	public static void evenOdd(int num)
	{
		System.out.println((num%2==0)?("THE NUM IS EVEN"):("THE NUM IS ODD"));	
		System.out.println("");
	}

	public static void squareRoot(int num)
	{
		int sq=num*num;
		System.out.println("THE SQUARE ROOT OF NUMBER IS "+sq);
		System.out.println("");
	}
}
