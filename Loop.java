class Loop
{
	public static void main(String[] args) 
	{
		
		//1 to 10
		System.out.println(" 1 TO 10 VALUES")
		for(int i =0 ;i<=10 ;i++)
		{
			System.out.println(i+" ");
		}


		//A to Z 
		System.out.println(" UPPERCASE")
		for(char ch = 'A'; ch<='Z';ch++)
		{
			System.out.println(ch+" ");
		}


        //a to z
		for(char ch = 'a';ch<='z' ;ch++)
		{
			System.out.println(ch+" ");
		}


        //0 to 9
		for(char ch = '0';ch<='9';ch++)
		{
			System.out.println(ch+" ");
		}
        

		//ASCII VALUES
		for(int i =0; i<=127; i++)
		{
			System.out.println(i+":" +((char)i));
		}
	}
}
