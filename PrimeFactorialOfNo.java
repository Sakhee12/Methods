import java.util.Scanner; 
class PrimeFactorialOfNo 
{
	//EXTRACT PRIME NO IN A FACTORS OF FACTORIAL
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number: ");
		int num = new Scanner(System.in).nextInt();

		int cnt = 0;

		for(int i =1; i<=num; i++)
		{
			if(num%i==0)
			{
			 System.out.println(i+" ");
			}

			else
			{
				System.out.println("  ");
			}
		
		//int j =i;
			   //cnt++;
		/*for(int k =1; k<=num; k++)	
			if(i%k==0)
				System.out.println(k);
		
		*/
		}
		
		
		
			
		
		//System.out.println(cnt==0?"is prime":num+"is not prime");
		//System.out.println("Count: "+cnt+" NO:"+i);



	}
}
