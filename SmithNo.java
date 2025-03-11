class SmithNo
{
	public static void main(String[] args) 
	{
		for (int i=1;i<1000;i++)
		{
			if (isSmith(i))
			{
				System.out.println(i);
			}
		}
	}

	public static boolean isSmith(int num)
	{
		int next=2;
		int sumOfDigit = sumOfDigit(num);
		int sumFact = 0;

		if (!isPrime(num)) 
		{
			
			while (num!=1)
			{
				while (num%next==0)
				{
					if (next<10) //if single digit
					{
						sumFact+=next;
					}
					else //if not divide it again
					{
						sumFact+=sumOfDigit(next);
					}
					num/=next;
					
				}
				next = nextPrime(next);
			}
			return sumFact==sumOfDigit;
		}
		return false;
	}
	public static int sumOfDigit(int num) 
	{
		int sum=0;
		while (num!=0)
		{
			sum+=(num%10);
			num/=10;
		}
		return sum;
	}

	public static int nextPrime(int num)
	{
		int start=num+1;
		while (true)
		{
			if (isPrime(start))
			{
				return start;
			}
			start++;
		}
						
	}

	public static boolean isPrime(int num)
	{
		int den=2;
		while (den<num)
		{
			if (num%den==0)
			{
				return false;
			}
			den++;
		}
		return true;
	}
}
