import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner hg = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = hg.nextInt();

		System.out.println((num==2 || num==3 ||num==5)?(num+" is Prime"):((num%2==0 || num%3==0 ||num%5==0)?(num+" is not Prime"):(num+" is prime")));
			
	}
}
