import java.util.Scanner;
class  KeithNo
{
	public static void main(String[] args) 
	{
		int num = 19;
		int dup = num;
		int len = 0;
		int sum = 0;
		boolean flag = true;

		//LOOP TO GET THE LENGTH  OF NO
		for(int i=num;i>0;i/=10)
			len++;

		//WE USED THE LEN AS A SIZE OF AN ARRAY
		int [] arr = new int[len];

		//LOOP TO STORE THE INT DIGITS FROM A NO
		for(int i=len-1;i>=0;i--)
		{
			int rem = num%10; //FETCHED THE LAST DIGIT
			arr[i] = rem; //STORED INSIDE ARRAY USING INDEX
			num/=10;
		    
		}

		//INFINITE LOOP WHICH WILL ITERATE UNTIL WE GET THE OUTPUT

		for(; ;)
		{
			//LOOP FIND THE SUM OF DIGIT
			for(int i=0;i<len;i++)
				sum+=arr[i];

			//SWAPPING OF ELEMENTS
			for(int i=1;i<len;i++)
				arr[i-1]=arr[i];

			arr[len-1]=sum;

			if(dup==sum)
			{
				break;
			}
			if(sum>dup)
			{
				flag=false;
				break;
			}
			sum =0;
		}
		if(flag)
		{
			System.out.println(dup+" IS KEITH NO");
		}
		else
		{
			System.out.println(dup+" IS NOT KEITH NO");
		}	
	}
}
