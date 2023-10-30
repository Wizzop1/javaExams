package twoeasy;

public class SimpleCar extends Vehicle implements Honkable {
	private int speed;
	
	public void accelerate() {
		speed+=10;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public void honk() {
System.out.println("Honk!");		
	}

	@Override
	void move() {
		System.out.println("Vehicle is moving!");
	}
	
	
}
