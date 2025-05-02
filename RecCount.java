class RecCount 
{
	public static void main(String[] args) 
	{
		System.out.println(Count(12345,0));
	}

	public static int Count(int num,int ct)
	{
		if (num==0)
		{
			return ct;
		}
		return Count(num/10,++ct);

		//return num==0?ct:Count(num/10,++ct);

	}
}
