package two;

public class Rectangle extends Shape{

	private double a;
	private double b;
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		double area = a*b;
		System.out.println(area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2*(a+b);
		System.out.println(perimeter);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
}
