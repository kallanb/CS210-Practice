package practicing;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {

	public static void main (String [] args)
	{
		try {
			Scanner console = new Scanner (System.in);
			System.out.print("Please enter three side lengths: ");
			double userInput = console.nextDouble();
			triangleArea(userInput, userInput, userInput);
		} 
		catch (InputMismatchException e)
		{
			throw new InputMismatchException("Input must be seperated by spaces, no commas");
			
		}

		
	
	}
	

	public static void triangleArea(double a, double b, double c)
	{
		double s = (a + b + c) / 2;
		double area  = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is: " + area);


	}



}
