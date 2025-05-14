import java.util.Scanner;
class HiExample 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value: ");
		int num = sc.nextInt();
		
		String op = ((num%2==0 && num%5==0)?(num+"HiTwoFive"):((num%5==0)?(num+"HiFive"):(num%2==0)?(num+"Hitwo"):(" ")));
		System.out.println(op);
	}
}
 