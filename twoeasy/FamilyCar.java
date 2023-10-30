package twoeasy;

public class FamilyCar extends SimpleCar{
	private int seats;
	
	public void addSeat() {
		seats++;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	

}
