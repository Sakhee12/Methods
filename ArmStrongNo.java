class ArmStrongNo 
{
	public static void main(String[] args) 
	{
		System.out.println(sumOfDigit(135,135,0));
	}

	public static boolean sumOfDigit(int num,int temp,int sum)
	{
		return temp==0 ? (num==sum) :
			sumOfDigit(num,temp/10,sum+=(power(temp%10,count(num,0))));
	}

	public static int count(int num,int ct)
	{
		return num==0?ct:count(num/10,++ct);
	}

	public static int power(int base,int raise)
	{
		int pow = 1;
		for (int i=1;i<=raise ;i++ )
		{
			pow*=base;
		}
		return pow;
	}
}
