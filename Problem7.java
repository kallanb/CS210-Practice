package practicing;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class Problem7 {

	public static void main(String[] args) throws FileNotFoundException {
	File file = new File("C:\\Users\\Kallan\\Desktop\\test.txt");
	Scanner sc = new Scanner(file);
	int[] tokens = new int [5];
	while(sc.hasNext())
	{
		String word = sc.next();
		int k = word.length();
		tokens [k]++;
	}
	for (int i = 0; i<5; i++)
	{
		System.out.println(i + ":" + tokens [i]);
	}

	}

}
