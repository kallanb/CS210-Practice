package practicing;

public class Triangles implements Shape {
	private double a;
	private double b;
	private double c;

	//Constructs a new triangle object given side lengths a,b,b
	public Triangles (double a, double b, double c) {
		this.a = a;
		this.b = b; 
		this.c = c;
	}
	
	//Methods
	public double getArea() {
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s -c));
	}
	
	public double getPerimeter() { 
		return a + b + c;
	}
	
}
