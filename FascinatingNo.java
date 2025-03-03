import java.util.Scanner;
class FascinatingNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the No: ");
		int num = sc.nextInt();
		int dup = newNum(num);
		System.out.println(count(dup));
	}

	public static int newNum(int num)
	{
		int num1 = 0;
		for(int i=2;i<=3;i++)
		{
			 //System.out.println("hfh"+num);
			 num1 =(num*1000)+(num*i);
		}
		return num1;
	
	}
	public static boolean count(int num)
	{
		//int num1 = newNum(num);
		//System.out.println(" "+num);
		for(int j=1;j<=9;j++)
		{
			int cnt = 0;
			for(int i =num;i>0;i/=10)
			{	
				if(j == i%10)
					cnt++;

				if(cnt>1)
				{
					//System.out.println("   "+cnt);
					return false;
				}
			
			}
		
		}
		return true;
	}
}









/*
public static int cnt(int num)
	{
		for(int i=1;i<=9;i++)
		{
			int cnt = 0;
			for(int j=num;j>0;j++)
			{
				if(i==j%10)
					cnt++;
			}
		}
	}
*/