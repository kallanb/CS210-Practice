package practicing;

public class Student {
	String name, course, grade;
	Student (String n, String c, String g)
	{
		name = n;
		course = c;
		grade = g;
	}

	public Student() {
	
	}
 
	public String toString()
	{
		return ("My name, course, and grade are " + name + ", "+ course +", " + grade);
	}

	public static void main (String[] args)
	{
		Student Eva = new Student();
		Eva.name="Eva";
		Eva.course="CS210";
		Eva.grade="A";
		System.out.println(Eva.toString());

	}


}