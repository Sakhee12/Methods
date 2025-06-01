class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num = 1234;
        int evensum = 0;
        int oddsum = 0;
		int temp = 0;

		int rem = num%10;
		temp = (rem%2==0) ? (evensum=evensum+rem) : (oddsum=oddsum+rem);

		num = num/10;
		rem = num%10;
		temp = (rem%2==0) ? (evensum=evensum+rem) : (oddsum=oddsum+rem);

        num = num/10;
		rem = num%10;
		temp = (rem%2==0) ? (evensum=evensum+rem) : (oddsum=oddsum+rem);
		
		num = num/10;
		rem = num%10;
		temp = (rem%2==0) ? (evensum=evensum+rem) : (oddsum=oddsum+rem);

		System.out.println("Even Sum "+evensum);
		System.out.println("Odd Sum "+oddsum);
	} 
}
