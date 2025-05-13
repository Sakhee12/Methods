import java.util.Scanner;
class FascinatingNumberWithoutString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The NUmber: ");
		int num = new Scanner(System.in).nextInt();
	    int dup=num;
		boolean flag = true;

		for(int i=2;i<=3;i++)
		{
			System.out.println("START");
			num =(num*1000)+(dup*i);
		}

         for(int i=1;i<=9;i++)
		{
			int cnt =0;
			for(int j=num;j>0;j/=10)
			{
				int rem = j%10;
				if(i==rem)
					cnt++;
			}
			if(cnt!=1)
			{
				flag=false;
				break;
			}
		}
		System.out.println(flag? dup+" is a Fascinating No" : dup+" is not Fascinating No");
		
	}
}
