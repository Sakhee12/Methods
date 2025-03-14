class TwinPrimeNo 
{
	public static void main(String[] args) 
	{
		System.out.println(nextPrime(2,4));
	} 

	public static boolean nextPrime(int n1, int n2)
	{
		if (n1>n2)
		{
			for (int i=2;i>n1;i++)
			{
				if (n1%2==0)
				{
					System.out.println("1 "+n1);
					return false;
				}
			}
		}
		else if(n2>n1)
		{
			for (int i=2;i>n2;i++)
			{
				if (n2%2==0)
				{
					return false;
				}
				
			}
		}
		return n1-n2<=2;
	}
}
