package practicing;

public class RecursivePractice {

	public static void main(String[] args) {
		System.out.println("Print Some Stars: ");
		writeStars(5);
	}

	public static void writeStars(int i) {
		if (i == 0) {
			System.out.print("* ");
		} else {
			System.out.print("* ");
			writeStars(i - 1);
		}
	}
}
