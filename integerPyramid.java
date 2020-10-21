package practicing;

public class integerPyramid {

	public static void main(String[] args) 	
	{
		numTriangle();
	}

	// Prints the following output
	// 1
	// 22
	// 333
	// 4444
	// 55555
	public static void numTriangle() 
	{
		for (int line = 1; line <= 7; line++) 
		{
			for (int j = 1; j <= line; j++) 
			{
				System.out.print(line);
			}
			System.out.println();
		}
	}
	

	

}


