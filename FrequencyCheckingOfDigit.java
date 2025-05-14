import java.util.Scanner;
class FrequencyCheckingOfDigit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
		long num = new Scanner(System.in).nextLong();
		int dgt=0;
		long max=0;
		
		for(int i=0;i<=9;i++)//LOOP FOR 0 TO 9 DIGIT
		{
			int cnt= 0;//TRACK THE COUNT OF THE NO
			
			for(long j =num;j>0;j/=10)//LOOP FOR EXTRACTING DIGITS FROM THE VALUE
			{
				
				long rem = j%10;//GETTING THE LAST DIGIT
				if(i==rem)//CHCKING IF THE DIGITS AND LAST DIGIT OF VALUE IS SAME || TRACKING THE FREQUENCY
				{
					cnt++;//IF THE NO IS SAME IT'LL ADD THE ONE VALUE TO IT
				}
			}
			if(cnt != 0)
			
				//System.out.println(i+":"+cnt);

				// for finding the max no in the range
			{
				if(max<cnt)
				{
					max=cnt;
				
					dgt= i;
				}
			}
			
		}
		System.out.println("MAX DIGIT IS  "+dgt+" WITH A FREQUENCY OF "+max);
	}
}
