package practicing;

public class ProblemFive {

	public static void main(String[] args) 
	
	{

	}

	// Prints the following output
	// 1
	// 22
	// 333
	// 4444
	// 55555

	public void printTriangle(int num)
	{
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println();
			}

	}


}
