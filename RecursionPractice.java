package practicing;

public class RecursionPractice {

	public static void main(String[] args) {
	
		int i = 5;
		System.out.println("Factorial of: " + i + " = " + factorial(i));
	}

	public static int factorial(int i) {
		if (i >= 1) {
			return i * factorial(i - 1);
		} else {
			return 1;
		}
	}
}
