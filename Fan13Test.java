package temi12do14;

public class Fan13Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan13 fan1 = new Fan13();
		Fan13 fan2 = new Fan13();
		fan1.setSwithedOn(true);
		fan1.setRadius(10);
		fan1.setSpeed(3);
		fan1.setColour("yellow");
		fan2.setSpeed(2);
		fan2.setRadius(5);
		System.out.println(fan1.ConvertToString());
		System.out.println(fan2.ConvertToString());
	}

}
