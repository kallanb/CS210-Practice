package practicing;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {

	public static void main(String[] args) {
		//userInputToCreateArray();
		int [] grades = {1,2,4,5,71,5,2};	
		Arrays.fill(grades, 72);
		System.out.println(Arrays.toString(grades));
	}

	private static void userInputToCreateArray() {
		Scanner input = new Scanner (System.in);
		System.out.print("How many elements?");
		int size = input.nextInt();
		int [] grades = new int[size];

		System.out.println("What are the values in the array?");

		for (int i = 0; i<size; i++)
		{
			int x = input.nextInt();
			grades [i] = x;

		}
		System.out.println(Arrays.toString(grades));
	}

}
