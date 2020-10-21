package practicing;

public class Area
{
	public static double radius;
	public static double circle()
	{
		return (radius*radius*Math.PI);
	}
	
	public static void main (String [] args)
	{
		Area.radius = 10.0;
        System.out.println("The radius of the circle is: " + Area.radius); 
        System.out.println("The area of the circle is: " + Area.circle());       

	}
	
}