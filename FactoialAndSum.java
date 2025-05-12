// Factroial of odd Num Fetched sum
class FactoialAndSum 
{
	public static void main(String[] args) 
	{
		int num = 123;
        int dup = num;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;//123%10=3
			if(rem%2!=0)//for odd no
			{
			int fact= 1;
			for(int i =rem; i>=1 ;i--)
				fact*=i;
			sum+= fact;
			}
			num/=10;
		}
		System.out.println(dup);
		System.out.println("SUM OF ODD NO IS: "+sum);
	}
}
