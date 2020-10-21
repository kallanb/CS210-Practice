package practicing;

import java.util.Arrays;

public class mod {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(array) + "\n");
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i] % 5);
		}

	}
}
