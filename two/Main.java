package two;

public class Main {

	public static void main(String[] args) {

		Person person = new Person();
		person.setAge(15);
		person.setName("All");
		person.introduce();
		Student student = new Student();
		student.setAge(15);
		student.setName("Bll");
		student.setGrade(3.50);
		student.introduce();
		
		
		Circle circle = new Circle();
		circle.setR(5);
		circle.area();
		circle.perimeter();
		Rectangle rectangle = new Rectangle();
		rectangle.setA(5);
		rectangle.setB(5);
		rectangle.area();
		rectangle.perimeter();
	
		
		Car driveCar = new Car();
		driveCar.setBrand("Ferrari");
		driveCar.setFuel(40);
		driveCar.setMileage(100000);
		driveCar.setSpeed(30);
		driveCar.accelerate();
		System.out.println(driveCar.getSpeed());
		driveCar.refuel();
		System.out.println(driveCar.getFuel());
		driveCar.drive(230);
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.setBatteryLevel(100);
		electricCar.setBrand("Tesla");
		electricCar.setEfficiency(30);
		electricCar.setSpeed(140);
		electricCar.drive(300);
		electricCar.charge();
		System.out.println(electricCar.getBatteryLevel());
		
		Car[ ] carObjects = new Car[5];

	}

}
