package practicing;

import java.io.*;
import java.util.Scanner;

public class FilePractice {

	public static void main(String[] args) throws FileNotFoundException {
		//input segment
		Scanner input = new Scanner (new File("C:\\Users\\Kallan\\Downloads\\seismicActivitySeattle.csv"));
		input.useDelimiter(",");
		input.nextLine();
		
		//output segment
		File dest = new File("Activity.txt");
		PrintStream ps = new PrintStream (dest);
		
		int count =1;
		while (input.hasNextLine() && count  <= 1)
		{
			String line = input.nextLine();
			Scanner lineScanner = new Scanner (line);
			lineScanner.useDelimiter(",");
			String id = lineScanner.next();
			double mag = lineScanner.nextDouble();
			
			if (mag>=1 && mag <=5)
			{
				input.nextLine();
				input.nextLine();
				input.nextLine();
				input.nextLine();
				String loc = input.next();
				
				ps.println(id + "\t" + id + "\t" + loc);
				
				
			}
			lineScanner.nextLine();
			
		}
		
		

	}

}
