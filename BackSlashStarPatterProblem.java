package practicing;

import java.util.Scanner;

public class BackSlashStarPatterProblem {

	public static void main (String [] args) {

		drawFigure();
		
	}
		
	public static void drawFigure() {
		Scanner sc1 = new Scanner (System.in);
		System.out.println("How many lines would you like?");
		int userInput = sc1.nextInt();

		for (int line = 1; line <=userInput; line++)
		{
			for (int slash = 1 ; slash <= (-4 * line + (4*userInput)); slash++)
			{
				System.out.print("/");
				
			}
			for (int star = 1; star <= (line * 8 - 8); star++)
			{
			System.out.print("*");
			}
			for (int backslash = 1 ; backslash <= (-4 * line + (4*userInput)); backslash++)
			{
				System.out.print("\\");
				
			}
			
			System.out.println();
		}

		sc1.close();
	}
	

}
