// 10    30     68     130    222
//2^2+2  3^2+3  4^2+4  5^2+5  6^2+6

class SeriesQuestion2 
{
	public static void main(String[] args) 
	{		
		 int num = 0; 
        for (int i = 1, p = 2; i <= 6; i++, p += 6 * (i - 1))
			//                              2+=6(1-1) =0+2 =2
  		    //   i=2,                       2+=6(2-1) =6+2=8
  		{
            num += p; 
			//0+2=2
			//2+8=10
            System.out.print(num + " "); 
	}
}
}

