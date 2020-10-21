package practicing;

public class ProblemOneA {

	public static void main(String args[])
	{

	System.out.println("Solving some problem using in-built function of the math library:");
	//Math.abs function can return the absolute value of int,double,float & long
	System.out.println("Math.abs(6.0) :");
	System.out.println(Math.abs(6.0));
	System.out.println("Math.abs(- 6.0) :");
	System.out.println(Math.abs(- 6.0));
	System.out.println("Math.ceil(10.25) :");
	//Math.ceil function returns the smallest double value that is greater than or equal to the argument and is equal to a mathematical integer.
	System.out.println(Math.ceil(10.25));
	System.out.println("Math.ceil(- 6.8) :");
	System.out.println(Math.ceil(-6.8));
	System.out.println("Math.floor(- 5.1) :");
	//Math.floor function returns the largest double value that is less than or equal to the argument and is equal to a mathematical integer
	System.out.println(Math.floor(-5.1));
	System.out.println("Math.floor(7.9) :");
	System.out.println(Math.floor(7.9));
	//Math.pow returns the value of the first value raised to the power of the second
	System.out.println("Math.pow(5,2) :");
	System.out.println(Math.pow(5,2));
	System.out.println("Math.pow(2,5) :");
	System.out.println(Math.pow(2,5));
	//Math.max function returns the maximum of the two values (it can be int/float/long/double)
	System.out.println("Math.max(1.5,2) :");
	System.out.println(Math.max(1.5,2));
	//Math.max function returns the maximum of the two values (it can be int/float/long/double)
	System.out.println("Math.min(3,0.5) :");
	System.out.println(Math.min(3,0.5));
	System.out.println("Math.min(2, 1.5) :");
	System.out.println(Math.min(2,1.5));
	System.out.println("Math.max(0.5,3) :");
	System.out.println(Math.max(0.5,3));
	//Math.sqrt function returns the correctly rounded positive square root of a double value.
	System.out.println("Math.sqrt(16.0) :");
	System.out.println(Math.sqrt(16.0));
	//Math.round method returns the closest long to the argument.
	System.out.println("Math.round(0.6) :");
	System.out.println(Math.round(0.6));
	System.out.println(Math.pow( 2.0 , 3 ));

	System.out.println("Math.ceil(Math.pow( 3 , 0.5 )) :" );
	System.out.println(Math.ceil( Math.pow( 3 , 0.5 ) ));
	/*Math.pow will evaluate to 1.7320508075688772 as it will calculate 3 raised to the power 0.5
	* then this value is passed to ceil function which rounds up the value to 2.0
	*/
	System.out.println("Math.floor(Math.pow(1.5 ,2)) :");
	System.out.println(Math.floor( Math.pow( 1.5 , 2 ) ));
	/*Math.pow will evaluate to 2.25 as it will calculate 1.5 raised to the power 2
	* then this value is passed to ceil function which rounds up the value to 2.0
	*/
	System.out.println("Math.ceil(Math.floor(3.5)) : ");
	System.out.println(Math.ceil(Math.floor(3.5)));
	/*Math.floor will evaluate to 3.0 as it will round down the value 3.5
	* then this value is passed to ceil function which makes no change because the value rounded
	* up value of 3.0 is also 3.0 had it been 3.1 it would have made it 4.0
	*/
	System.out.println("Math.min(Math.max(3.0,2), 2.5) :");
	System.out.println( Math.min( Math.max( 3.0 , 2 ), 2.5) );
	/*Math.max will evaluate to 3.0 as it will compare the values 3.0 and 2 and return the larger one
	* then this value is passed to min function which calculates the minimum value amongst 3.0 and 2.5
	* and hence the entire expression evaluates to 2.5
	*/
	System.out.println("Math.max(Math.min(2.0,3),3.0) : ");
	System.out.println( Math.max( Math.min( 2.0 , 3 ), 3.0));
	/*Math.min will evaluate to 2.0 as it will compare the values 2.0 and 3 and return the smaller one which is 2.0
	* then this value is passed to max function which compares the two values 2.0 and 3.0 and returns
	* the maximum value amongst 2.0 and 3.0
	* and hence the entire expression evaluates to 3.0
	*/
	System.out.println("Math.sqrt(Math.pow(2.0,3))");
	System.out.println( Math.sqrt( Math.pow( 2.0 , 3 ) ));
	/*Math.pow will evaluate to 8.0 as it will calculate 2.0 raised to the power 3
	* then this value is passed to sqrt function which caculates the square root of 8.0
	* and hence the entire expression evaluates to 2.8284271247461903
	*/
	System.out.println( "Math.pow(Math.sqrt( 9 ),2)");
	System.out.println( Math.pow( Math.sqrt( 9 ) , 2 ) );
	/*Math.sqrt will evaluate to 3.0 as it will calculate the square root of 9 which comes out to be 3.0
	* then this value is passed to pow function which caculates the 3.0 raised to the power 2
	* and hence the entire expression evaluates to 9.0
	*/
	//Similar expressions....
	System.out.println("Math.round(Math.max(2.1,3.1))");
	System.out.println(Math.round(Math.max( 2.1 , 3.1 ) ));
	System.out.println("Math.abs(Math.abs(8.0)) :");
	System.out.println(Math.abs(Math.abs( 8.0 )));
	System.out.println("Math.min(Math.abs(1.5),2) : ");
	System.out.println(Math.min(Math.abs( 1.5 ), 2 ) );
	System.out.println("Math.ceil( Math.pow(1 ,0.5 )) :" );
	System.out.println( Math.ceil( Math.pow( 1 , 0.5 ) ) );

	}
	}