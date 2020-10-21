package practicing;

import java.util.Scanner;

public class isPrime
{

	public static void main (String [] args)
	{
		int num = promptUser();
		isPrime(num);
		System.out.println("Goodbye!");
		



	}


	public static int promptUser() {
		Scanner console = new Scanner (System.in);
		System.out.print("Welcome to the prime number tester, please enter an integer: ");
		int num = console.nextInt();
		return num;
		
	}


	public static boolean isPrime(int number){ 
		int sqrt = (int) Math.sqrt(number) + 1; 
	
	for (int i = 2; i < sqrt; i++) {
		if (number % i == 0) 
		{ // number is perfectly divisible - no prime 
			System.out.println("False");
			return false;  }
		
		}
	System.out.println("True");
	return true; 
	
	}

}


