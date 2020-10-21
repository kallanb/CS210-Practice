package practicing;
import java.util.Random;


public class ProblemOneCRandomNumber
{

	public static void main(String[] args) 
	{

		Random random = new Random();
	    int count = 0;  
		for(int i = 1; i<100; i++)
		{
		    int randomInteger = random.nextInt(10);
		    System.out.println("Random Integer: " + randomInteger);
		    count++;

		}
	    System.out.println("Total Number of Integers: " + count);



	}


}
