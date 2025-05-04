import java.util.Scanner;
class CelsiusToFahrenheit 
{
	public static void main(String[] args) 
	{
	     Scanner hd = new Scanner(System.in); 
		 System.out.println("Enter a degree in celcius: ");
		 double degree = hd.nextDouble();
		 double faherenheit = ((9.0/5)*degree)+32;
		 System.out.println(degree+" Celsius is "+faherenheit+" Fahrenheit");
	}
}
