package practicing;

public class ToBinaryMethod {

	public static void main(String[] args) 

	{
		toBinary(42);

	}

	/* Write a method named toBinary that accepts an integer as a parameter and 
	 * returns a string of that number's representation in binary. For example, 
	 * the call of toBinary(42) should return "101010".
	 */
	public static String toBinary(int num) {
		if (num == 0)
			return "0";
		String str="";
		while (num != 0) {
			str = (num%2)+str;
			num /= 2;
		}
		System.out.println(str);
		return str;
	}

}
