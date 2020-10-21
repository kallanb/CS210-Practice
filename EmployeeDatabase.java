package practicing;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class EmployeeDatabase {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner (new File("C:\\Users\\Kallan\\Desktop\\hours.txt"));
		Scanner console = new Scanner (System.in);
		System.out.print("Enter an ID: ");
		int desiredID = console.nextInt();
		boolean found = false; //have I found the person?

		while (input.hasNextLine())
		{
			String line = input.nextLine();
			Scanner lineScan = new Scanner (line);

			//process one employee
			int id = lineScan.nextInt();
			if (id == desiredID)
			{
				found = true;
				String name = lineScan.next();
				double totalHours = 0;
				int days =0;
				while (lineScan.hasNextDouble())
				{
					totalHours += lineScan.nextDouble();
					days++;


				}
				System.out.println(name + " worked " + Math.round(totalHours*100.0)/100.0 + 
						" (" + Math.round(totalHours/days*100.0)/100.0 + " hours/day)");

			}	
			
		}
		
		if (!found)
		{
			System.out.println("Employee ID " + desiredID + " not found");
		}
		
		




	}

}	
