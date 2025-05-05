class CondOperLarNoExample 
{
	public static void main(String[] args) 
	{
		
         int a = 54;
		 int b = 97;
		 int c = 87;

		 int lar = (a>b)?((a>c)?(a):(c)) : ((b>c)?(b):(c)); //nested ternary Operator
		 // using this type of condition when 3 values have to compare
		 System.out.println(lar);

	}
}
