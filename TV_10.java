package paki4;

public class TV_10 {
	int channel;
	int volume;
	boolean on;
	
	public TV_10 () {
		channel = 1;
		volume = 4;
		on = false;
	}
	public void switchOn() {
		on = true;
	}
	public void switchOff() {
		on = false;
	}
	public void setChannel(int newChannel) {
		if(newChannel>120 || newChannel <1 || !on) {
			return;
		}
		channel = newChannel;
	}
	public void channelUp() {
		if (channel == 120 || !on) {
			return;
		}
		channel++;
	}
	public void channelDown() {
		if(channel == 1 || !on) {
			return;
		}
		
		channel--;
	}
		public void setVolume( int newVolume) {
			if (newVolume > 7 || newVolume< 1 || !on) {
				return;
			}
			volume = newVolume;
		}
		
		public void volumeDown() {
			if( volume == 1 || !on) {
				return;
			}
			
			volume--;
		}
}
