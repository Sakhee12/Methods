class FindMaxDigitAmongTheNumber 
{
	public static void main(String[] args) 
	{
		int num = 67891257;
		int max = 0;
		for(int i = num; i>0;i/=10)
		{
			int dgt = i%10;
			if(max<dgt)
				max = dgt;
		}
		System.out.println("LARGEST DIGIT FROM "+num+"IS "+max);
	}
}
