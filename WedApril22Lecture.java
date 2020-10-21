package practicing;

public class WedApril22Lecture {

	private static int i;

	public static void main(String[]args)
	{
		System.out.println("This is Kallan's Practice Code: ");
		loops();


	}

	public static void loops() {
		setI(0);
		outerMethod();

}

	public static void outerMethod() {
		int i;
		for (i=0;i<11;i++)
		{
			System.out.println("outer:" + i);
			i = innerLoop();
	}
	}

	public static int innerLoop() {
		int i;
		for (i=0;i<10;i++)
		{
		System.out.println("inner:" + i);	

}
		return i;
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		WedApril22Lecture.i = i;
	}
}

