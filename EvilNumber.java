//if that binary no have even no of 1's

import java.util.Scanner;
class EvilNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("ENTER THE NUMBER: ");
		int num = new Scanner(System.in).nextInt();
		String bin ="";
		for(int i=num;i>0;i/=2)
		{
			bin = (i%2)+bin;
		}
		int cnt =0;
		for(int i=0;i<bin.length();i++)
		{
			char ch = bin.charAt(i);
			if(ch=='1')
				cnt++;
		}
		if(cnt%2==0)
			System.out.println("IS A EVIL NO");

		else
			System.out.println("IS NOT A EVIL NO");
	}
}
