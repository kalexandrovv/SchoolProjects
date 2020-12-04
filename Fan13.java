package temi12do14;

public class Fan13 {
	public Fan13() {
	 }
	private final static int SLOW = 1;
	private final static int MEDIUM = 2;
	private final static int FAST = 3;
	
	private int speed = this.SLOW;
	private boolean switchedOn = false;
	private double radius = 5.0;
	private String colour = "blue";
	
	
	int getSpeed() {
		return speed;
	}
	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
			public void setSwithedOn(boolean OnOff) {
			this.switchedOn = OnOff;
			}
			public boolean getSwithedOn() {
				return this.switchedOn;
			}
						public void setRadius(double newRadius) {
							this.radius = newRadius;
						}
						public double getRadius() {
							return this.radius;
						}
	public void setColour(String newColour) {
		this.colour = newColour; 
	}
	
	
	
	public String getColour() {
		return this.colour;
	}
	String ConvertToString() {
		String speed1 = Integer.toString(speed);
		String radius1 = Double.toString(radius);
		if (switchedOn) {
			return ("The speed is " + speed1 + ". The radius is " + radius1 + ". The colour is " + colour + "."); 
		} else {
			return ("It's switched off. The radius is " + radius1 + ". The colour is " + colour + "."); 
		}
	}
}