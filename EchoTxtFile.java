package practicing;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;

public class EchoTxtFile {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner (new File ("C:\\Users\\Kallan\\Downloads\\tudor (1).dat"));
		System.out.println(input.nextLine());

	}
}
