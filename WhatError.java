package practicing;

public class WhatError {


	// Driver program to test above function 
	public static void main(String[] args) {
		String word = "wordWordWord";
		SubString(word);


	}
	public static void SubString(String word)
	{
		char[] chars = word.toCharArray();
		char[] subString = new char[chars.length];
		for(int i = 0; i < chars.length; i++)
		{
			subString[i] = chars[i];
			for (int j = 0; j <= i; j++)
			{
				if (subString[j] != 'o')
				{
					System.out.print(subString[j]);
				}
			}
			System.out.println();

		}

	} 
} 


