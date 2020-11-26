package paki4;

public class TV_10Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV_10 tv1  = new TV_10();
		System.out.println("channel "+ tv1.channel + " volume " + tv1.volume + " on: " + tv1.on);
		tv1.switchOn ();
		tv1.channelUp ();
		tv1.volumeDown();
		System.out.println("channel "+ tv1.channel + " volume " + tv1.volume + " on: " + tv1.on);

	}

}
