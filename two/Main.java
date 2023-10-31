package twoeasy;

public class Main {

	public static void main(String[] args) {
		
		//////Cars
		SimpleCar carre = new SimpleCar();
		FamilyCar bigcarre = new FamilyCar();
		Bicycle bike = new Bicycle();
		carre.setSpeed(50);
		carre.accelerate();
		System.out.println(carre.getSpeed());
		bigcarre.setSeats(4);
		bigcarre.addSeat();
		System.out.println(bigcarre.getSeats());
		carre.honk();
		carre.move();
		bike.move();
		if(bigcarre instanceof FamilyCar)System.out.println("This is a Family Car");
		if(carre instanceof SimpleCar)System.out.println("This is a Simple Car");

		/////Dance
		DanceMove moonwalk = new DanceMove();
		moonwalk.setName("moonwalk");
		moonwalk.setDuration(5);
		moonwalk.perform();
		moonwalk.start();
		BreakDanceMove complex = new BreakDanceMove();
		complex.setComplexity(5);
		complex.setDuration(20);
		complex.setName("Break Dance");
		complex.perform();
		Song bohemian = new Song();
		bohemian.sing();
		bohemian.start();
		if(moonwalk instanceof DanceMove)System.out.println("This is a DanceMove");
		if(complex instanceof BreakDanceMove)System.out.println("This is a BreakDanceMove");
				
	}

}
