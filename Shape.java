package practicing;
//abstract method. A header without an implementation. 
// area and perimeter are the abstract methods
//compiler will not instantiate an abstract class. Instead serves as a superclass to hold common code and declare abstract behavior 
//Abstract classes are allowed to implement interfaces

//create a method definition

public interface Shape {
	public double getArea();
	public double getPerimeter();

}
