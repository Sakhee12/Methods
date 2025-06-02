import java.util.Scanner;
class UserName 
{
	//Printing one by one character of username
	public static void main(String[] args)
	throws InterruptedException
	{
		Scanner ed = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String un = ed.next().toUpperCase();
		int len = un.length();
		for(int i=0;i<len;i++)
		{
			System.out.println(un.charAt(i));
			Thread.sleep(2000);
		}
	}
}
