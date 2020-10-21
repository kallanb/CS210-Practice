package practicing;

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		// local variable declaration
		int n;
		double sum;
		// Scanner class to get input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer:");
		n = sc.nextInt();
		// call to sumTo function and pass n as parameter
		sum = sumTo(n);
		// print the result
		System.out.println("Sum is : "+ sum);
	}

	public static double sumTo(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Illegal Power Argument");
		}
		else if(n == 0) {
			return 0.0; }
		else {
			return (1.0/n) + sumTo(n-1);
		}
	}
}