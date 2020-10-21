package practicing;

public class Rectangle implements Shape{
	private double length;
	private double width;

	//Constructors
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//Methods 
	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * length + 2 * width;
	}


}

