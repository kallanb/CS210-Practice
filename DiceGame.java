package practicing;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		//diceGame();
		//doWhilePractice();
		booleanPractice();
	}
	
	public static void booleanPractice()
	{
		Scanner console = new Scanner (System.in);
		System.out.print("Enter age: ");
		int age = console.nextInt();
		System.out.print("Enter height: ");
		double height = console.nextDouble();
		System.out.print("Enter Salary: ");
		double salary = console.nextDouble();
		
		boolean goodAge    = age >= 12 && age < 29;
		boolean goodHeight = height >= 78 && height < 84;
		boolean rich       = salary >= 100000.0;

		if ((goodAge && goodHeight) || rich) {
		    System.out.println("Okay, let's go out!");
		} else {
		    System.out.println("It's not you, it's me...");
		}

	}
	
	public static void doWhilePractice()
	{
		Random rand1 = new Random();
		int count = 0;
		int numGenerator = 0;
		
		do {
			numGenerator= rand1.nextInt(6) + 1;
			count++;
			System.out.println(numGenerator);
		} while (count>10 && count <20);
		{
			System.out.println("Your random number is: " + numGenerator);
			count++;
			
		}
		
		
	}

	public static void diceGame() {
		Random rand = new Random();
		int tries = 0;
		int sum;
		
		do {
			int roll1 = rand.nextInt(6) + 1;
			int roll2 = rand.nextInt(6) + 1;
			sum = roll1 + roll2;
			System.out.println(roll1 + " + " + roll2 + " = " + sum);
			tries++;
		} while (sum!=7);
		{
			System.out.println("You won after " + tries + "  tries!");
		}
	}
	
	
	
	
	
	


}
