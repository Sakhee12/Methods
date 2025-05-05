import java.util.Scanner;
class CheckStringOddEvenConvertOddEven 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int count = 0 ;

		while(num>0)
		{
			count++;
			num /= 10;
		}

		String newnum ="";
		for(int i = dup;i>0;i/=10)
		{
			int rem = i%10;
			if(rem%2==0)
			{
				newnum = ++rem + newnum;
			}
			else
			{
				newnum = rem + newnum;
			}
		}
		System.out.println(dup+":"+newnum);
	}
	//System.out.println(dup+":"+newnum);
}
