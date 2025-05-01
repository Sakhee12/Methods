class CoPrime 
{
	public static void main(String[] args) 
	{
		System.out.println(isCoPrime(5,3));
	}

	public static int hcf(int n1,int n2)
	{
		int min = n1<n2 ? n1: n2;
		while (true)
		{
			if (n1%min==0 && n2%min==0)
			{
				return min;
			}
			min--;
		}
	}

	public static boolean isCoPrime(int n1,int n2)
	{
		return hcf(n1,n2)==1;
	}
}
