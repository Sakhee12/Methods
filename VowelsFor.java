import java.util.Scanner;
class VowelsFor 
{
	//PRINT ALL VOWELS
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the username: ");
	    String i = sc.next().toUpperCase();
		int len = i.length();
		for(int a=1; a<len; a++)//when condition->a<=len__it throws exception to clear that just use->a<len
		{
			char ch=i.charAt(a);

			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("The Vowels are : "+ch);
			
		}
			
		}
	}
}

