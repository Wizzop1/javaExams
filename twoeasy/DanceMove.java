package twoeasy;

public class DanceMove extends Performance{
	private String name;
	private int duration;
	
	public void perform() {
		System.out.println("Performing the " + name +" for " + duration +" seconds");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public void start() {
		System.out.println("Starting the performance");
	}
	
	

}
