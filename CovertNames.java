package practicing;

public class CovertNames {

	public static void main(String[] args) {
		System.out.println(convert("Kallan, Brainard"));
		System.out.println(convert("Kyle, Kasner"));
	}
	
	public static String convert(String name)
	{
		int commaIndex = name.indexOf(",");
		String lastName = name.substring(0, commaIndex);
		String firstName = name.substring(commaIndex + 2, name.length());
		return firstName.toUpperCase() + " " + lastName;
	}

}
