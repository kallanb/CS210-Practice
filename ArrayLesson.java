package practicing;

import java.util.Arrays;

public class ArrayLesson {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		int [] iq = {123,456,789};
		myArray(iq);
		System.out.println(Arrays.toString(iq));

	}
	
	public static void myArray(int[] a)
	{
		for (int i = 0; i<a.length; i++)
		{
			a[i] = a[i]*2;
		}
		
	}

}
