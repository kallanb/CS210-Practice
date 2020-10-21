package practicing;

import java.io.*;
import java.util.Scanner;

public class FileProcessing {

	public static void main(String[] args) throws FileNotFoundException{
		//input
		Scanner input = new Scanner (new File ("C:\\Users\\Kallan\\Downloads\\seismicActivitySeattle.csv"));
		input.useDelimiter(",");
		input.nextLine();
		
		//output
		File dest = new File ("ActivityReport.txt");
		PrintStream ps = new PrintStream(dest);
		int count = 1;
		

		while (input.hasNextLine())
		{
			String line = input.nextLine();
			Scanner lineScanner = new Scanner (line);
			lineScanner.useDelimiter(",");
			String id = lineScanner.next();
			double mag = lineScanner.nextDouble();
			
			if (mag >=1 && mag <= 4)
			{
				input.nextLine();
				input.nextLine();
				input.nextLine();
				input.nextLine();
				String loc = input.next();
				
			}

			
			
			
		}
	}

}
