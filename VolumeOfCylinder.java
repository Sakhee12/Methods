import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner jg = new Scanner(System.in);
		System.out.print("Enter the radius  of cyclinder: ");
		float radius = jg.nextFloat();
		System.out.print("Enter the height: ");
		float height = jg.nextFloat();
		final float pi = 3.14f;
		float area = pi*(radius*radius);
		float volume = (area*height);
		System.out.println("The area is: "+area);
		System.out.println("The Volume is: "+volume);
	}
}
