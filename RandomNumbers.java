package practicing;
import java.util.*;

public class RandomNumbers {

	public static void main(String[] args) {
		System.out.println("Let's Roll Some Dice!");
		Random rand = new Random();
		int random = rand.nextInt();
		int odds = 0;
		int rolls = 0;
		
		while (odds<3)
		{
			int roll = rand.nextInt(6) + 1;
			System.out.println("You rolled a: " + roll);
			
			if (roll %2 == 1)
			{
				odds++;
			}
			else 
			{
				odds = 0;
			}
			rolls++;
		}
		
		System.out.println("Three in a row after " + rolls + " rolls");
		

	}

}
