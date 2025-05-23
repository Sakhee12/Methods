// 1      3         9        33            153            873
//1!    1!+2!     1!+2!+3!   1!+2!+3!+4!  1!+2!+3!+4!+5!  1!+2!+3!+4!+5!+6!


class SeriesQuestion3 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int num=1;num<=6;num++)
		{
			int rem=num%10;
			int fact= 1;
			for(int i =rem; i>=1 ;i/=10)
			{
				//int rem = i%10;//123%10=3
				fact*=i;
				
				sum+= fact;
				num
			}
			
			
			System.out.println("s  "+sum);
			//System.out.println("f"+fact);
			
		}
		//num++;
		
	}
}

