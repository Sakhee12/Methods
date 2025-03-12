import java.util.Scanner;
class CheckVowelOrConsonant 
{
	public static void main(String[] args) 
	{
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE CHARACTER");
		String ch = sc.next();
		*/
		
		System.out.println(isVow('b') ? "IS A VOWEL" : "IS A CONSONENT");
	}

	public static boolean isVow(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u')
			return true;
		else
			return false;
	}
}
