package two;

public class Circle extends Shape{
	
	private double pi = 3.14;
	private double r;
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		double area = pi*Math.pow(2, r);
		System.out.println(area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2*pi*r;
		System.out.println(perimeter);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
}
