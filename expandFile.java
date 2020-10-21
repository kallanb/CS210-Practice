package practicing;

import java.io.*;
import java.util.*;

public class expandFile {

	//Read from a CSV file that has seismic activity data and report quakes of magnitude between 1 and 2
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner (new File("C:\\Users\\Kallan\\Desktop\\practice.txt"));
		expandFile(input);

	}

	public static void expandFile (Scanner input)
	{
		while (input.hasNext())
		{
		String line = input.nextLine();
		System.out.println(line);
		}








	}



}
