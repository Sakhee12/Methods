//2  6  22  278  65814

class SeriesQuestion 
{
	public static void main(String[] args) 
	{
		/*
		int num1 = 2;
		System.out.println(num1+" ");
		for(int i=1,p=2;i<5;i++,p*=2)
		{
			int pow = 1;
			for(int j =1;j<=p;j++)
				pow*=2;
			System.out.println(pow+num1+" ");
			num1 += pow;
			
		}
		*/
		 int num = 0; // Start from 0 to calculate first term dynamically
        for (int i = 1, p = 10; i <= 5; i++, p += 6 * (i - 1)) {
            num += p; // Add difference to previous term
            System.out.print(num + " "); // Print result
	}

}
