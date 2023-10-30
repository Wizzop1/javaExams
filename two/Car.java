package two;

public class Car {
	private String brand;
	private int speed;
	private int fuel;
	private int mileage;
	
	public void accelerate() {
		speed = getSpeed() + 5;
	}
	public void refuel() {
		
		fuel = getFuel() + 5;
	}
	public void drive(int distance) {
		mileage = getMileage()+distance;
		fuel = getFuel()-(distance/40);
		System.out.println("Driving!");
		System.out.println("Mileage now is: " + mileage + " Fuel now is: " + fuel);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
}
