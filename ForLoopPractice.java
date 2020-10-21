package practicing;

public class ForLoopPractice {
	

	public static void main(String[] args) {
		//firstExample();
		nestedLoop();

	}

	private static void firstExample() {
		int sum = 0;
		
		for (int i=0; i<=5;i++)
		{
			System.out.println(i + " squared is " + (i*i));
			sum+=i*i;
		}
		System.out.println("The Sum of all squared numbers is: " + sum);
		System.out.println();
		System.out.println("Done!");
	}
	
	public static void nestedLoop()
	{
	for (int i = 1; i<=3; i++)
	{
		for (int j = 1; j<i; j++)
		{
			for (int k = 1; k<i; k++)
			{
				System.out.print(i);
				
			}
		}
		System.out.println(i);
	}
	System.out.println("Finished!");
		
	}


}

