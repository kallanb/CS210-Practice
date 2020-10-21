package practicing;

public class practicing {

public static void main (String [] args)
{
System.out.println("This program will hopefully do something");
loops();
}
public static void variableUpdates()
{
int a =  2;
a+=5; //test out other arithmetic operations
System.out.println("Updates value of a: "+a+" +b"); //a= 8 b=7
int b=a++;//7++ -> b=7 then increase by 1
System.out.println("Post increment update on a and b: "+a+" +b)");
//Pre increment
b=++a;//a is incremented to 9 and then the result is stored in b
System.out.println("Pre increment update on a : "+a+" "+b);
b=a--;
System.out.println("Post decrement update on a : "+a+" "+b);
}

public static void loops()
{
	int i=0;
for(i=1;i<=10;i++)
{
System.out.println("*");
}
System.out.println("Outside the for loop "+i); //i=11 which made the loop exit


for (i=10;i>=1;i--)
{
	System.out.println(i);
	booleanCheck(i);

}

System.out.println("Increment Update Loop Practice: ");

for (i=1;i<100;i++)
{

System.out.println(i);
booleanCheck(i);
}








}
private static void booleanCheck(int i) {
	if (i==10)
	{
		System.out.println("Check this out");
	}
	else
	{
		System.out.println("*");
	}
}


}
