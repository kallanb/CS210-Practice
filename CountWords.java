package practicing;

import java.io.*;
import java.util.*;

public class CountWords {

	public static void main(String[] args) throws FileNotFoundException {
		Set<String> words = new HashSet<String>();
		
		Scanner input = new Scanner(new File("C:\\Users\\Kallan\\Downloads\\EZDrummer 2\\R2R\\R2R.txt"));
		while (input.hasNext()) {
			String word = input.next();
//			if (!words.contains(word)) {
				words.add(word);
//			}
		}
		
		System.out.println("There are " + words.size() + " unique words in this file");

		
		for (String word : words) {
			System.out.println(word);
		}
	
	}
	//this took awhile though. Which leads us to set collections in Java. 


}
