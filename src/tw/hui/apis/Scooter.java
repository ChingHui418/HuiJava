package tw.hui.apis;

public class Scooter extends Bike {
	private int gear;
	private String color;
	
	public Scooter() {
		super(1);
		System.out.println("Scooter()");
		color = "Yellow";
	}
	
	public Scooter(String color) {
		this.color = "Red";
	}
	
	public String getColor() {
		return color;
	}
	
	
	public Scooter upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.8 * gear;
		 return this;
	}
	
	// Overload
	public void upSpeed(int level) {
		speed = speed < 1 ? 1 : speed * 1.8 * level;
	}
	
//	呼喚太麻煩，不會這麼用
//	public void upSpeedV2() {
//		speed = speed < 1 ? 1 : speed * 1.8 * gear;
//	}
	
	public void setGear(int gear) {
		if(gear>=0 && gear<=4) {
			this.gear = gear;
		}
	}
	
	public int getGear() {
		return gear;
	}
	
}
