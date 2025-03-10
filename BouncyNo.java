class BouncyNo 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<100;i++ )
		{
			if (isBouncy(i))
			{
				System.out.println(i);
			}
		}
		//System.out.println(isBouncy(123));
	}

	public static boolean isBouncy(int num)
	{
		
		boolean inc=false,dec=false;

		int last=num%10;
		num/=10;
		int secLast=num%10;

		while (num>0)
		{
			if (last<secLast)
			{
				inc = true;
			}
			else if (last>secLast)
			{
				dec=true;
			}

			last=secLast;
			num/=10;
			secLast=num%10;
			
			if (inc&&dec)
			{
				break;
			}
		}
		return inc && dec;
	}
}
