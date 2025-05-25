//a positive integer where the sum of all its digits equals the product of all its digits


class SpyNo 
{
	public static void main(String[] args) 
	{
		int num = 1124;
		int pro =1;
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int rem = i%10;
			pro*=rem;
			sum+=rem;			
			
		}
		System.out.println((pro==sum)? (num+" is a spy"):(num+ " is not spy"));
		
	}
}

