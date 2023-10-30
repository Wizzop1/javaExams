package twoeasy;

public class BreakDanceMove extends DanceMove{
	
	private int complexity;
	
	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}
	
	public int getComplexity() {
		return complexity;
	}
	
	@Override
	public void perform() {
		System.out.println("Performing the " + getName()+" for " + getDuration()+" seconds" +" with complexity " + complexity);
	}

}
