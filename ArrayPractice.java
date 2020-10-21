package practicing;

import java.util.Scanner;

public class ArrayPractice {
	
	//example without using an array to store values

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("How many days' temperatures?");
	int days = input.nextInt();
	int dayCounter = 0;
	int dayTemp = 0;
	int totalTemp = 0;
	int aboveAvgCount = 0;
	while (dayCounter<days)
	{
		dayCounter++;
		dayTemp +=20;
		totalTemp += dayTemp;
	
		 System.out.println("Day " + dayCounter + " high temperature: " + dayTemp);
		 if (dayTemp >= 80)
		 {
			 aboveAvgCount++;
		 }

	}
	

	 double averageTemp = totalTemp / dayCounter;
	 System.out.println();
	 System.out.println("The average temperature was: " + averageTemp);
	 System.out.println();
	 System.out.println(aboveAvgCount + " days were above average");
	 
	 


	}

}
