package practicing;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {

		//arrayExample();
		//arrayExampleTwo();
		kallansArray();

		

	}
	
	public static void arrayExampleTwo()
	{
		int[] arrayTwo = new int[10]; 
		for (int i=0; i<arrayTwo.length; i++)
		{
			arrayTwo[i] = (int)(Math.random()*1000+1);
			
		}
		System.out.println(arrayTwo[4]);
	}
	

	public static void arrayExample() {
		int[] num= new int[10];//allocate a set number of spaces and initialize later
		//initialize the array with numbers from 0 to 9
		for(int i=0;i<num.length;i++)
		{
			num[i]=(int)(Math.random()*1000+1);//initialize index i with the value i
		}
		//check what is the element in position 2
		
		System.out.println(num[2]);
		//read all elements from the array
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println(Arrays.toString(num));
	}
	
	public static void kallansArray()
	{
		int i = 0;
		int[] kallansArray = new int[9];
		while (i<kallansArray.length)
		{
			kallansArray[i]=(int)(Math.random()*100+1);
			System.out.println(kallansArray[i]);
			i++;
		}
	
	}
	

}
