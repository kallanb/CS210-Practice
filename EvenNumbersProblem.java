package practicing;
import java.util.Scanner;

public class EvenNumbersProblem {


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integers: ");

		double sum = 0.0;
		double counter=0,evenCounter=0;
		while(input.hasNextInt()) 
		{
			int next = input.nextInt();
			sum += next;
			++counter;
			if(next%2==0)
				evenCounter++;
		}

		System.out.println(counter + " numbers," + "Sum = " + sum);
		System.out.println("\nEven Numbers: "+evenCounter+"("+evenCounter/counter*100+"%)");
		
		input.close();
	}

}
