import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner hf = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = hf.nextInt();

		System.out.println("Enter the Range: ");
		int range = hf.nextInt();

		for( int i=1; i<=range ;i++)
		{
			System.out.println(num+"X"+i+"="+(num*i));
		}
	}
}
