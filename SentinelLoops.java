package practicing;

import java.util.Scanner;

public class SentinelLoops {
	
	public static final int SENTINEL = -1;

	public static void main(String[] args) {
		
		Scanner console = new Scanner (System.in);
		System.out.println("Please enter a number (" + SENTINEL + " to quit): ");
		int number = console.nextInt();
		int min = number;
		
		//read initial value (place a post)


		
		while (number!= SENTINEL ){
		//is this the smallest number? 
		if (number<min)
		{
			min = number;
		}
		
		System.out.println("Please enter a number (" + SENTINEL + " to quit): ");
		number = console.nextInt();
		
		}
		
		System.out.println("The minimum is: " + min);
	}

}
