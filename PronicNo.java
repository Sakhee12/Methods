//Pronic number is the number which is the product of two consecutive integers.

class PronicNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isPronic(240));
	}

	public static boolean isPronic(int num)
	{
		for (int i=1; ;i++ )
		{
			if (i*(i+1)==num)
			{
				return true;
			}
			else if (i*(i+1)>num)
			{
				return false;
			}
		}
	}
}
