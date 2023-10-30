package two;

public class ElectricCar extends Car{
	private int batteryLevel;
	private int efficiency;
	
	public void charge() {
		batteryLevel = getBatteryLevel() + 10;
	}

	public void driveElectric(int distance) {
		batteryLevel = getBatteryLevel() - (distance/efficiency);
		if(batteryLevel<=5) System.out.println("Battery level is critically low!");
	}
	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public int getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	
	

}
