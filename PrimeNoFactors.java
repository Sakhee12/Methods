import java.util.Scanner;
class PrimeNoFactors 
{
	public static void main(String[] args) 
	{
		System.out.println("ENter the No.: ");
		int num = new Scanner(System.in).nextInt();
		//int cnt = 0;

		for(int i=2;i<num;i++)
			if(num%i==0)
			
			//cnt++;

		System.out.println(num==0?num+"is a Prime ":num+"is not prime");
	}
}
