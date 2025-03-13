class MagicNo 
{
	public static void main(String[] args) 
	{ 
		// for a range
		for(int i=1;i<1000;i++)
		{
			if(isMagic(i))
				System.out.println(i);
		}
		//To check a Number
		//System.out.println(isMagic(55));
	}

	public static boolean isMagic (int n)
	{
		int sum = 0;
		 
       while (n>0|| sum > 9)
       { 
           if (n == 0) 
           { 
               n = sum; 
               sum = 0; 
           } 
           sum += n % 10; 
           n /= 10;
       }
	   return sum==1;
	}
}
