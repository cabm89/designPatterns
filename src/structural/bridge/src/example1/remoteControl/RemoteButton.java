package structural.bridge.src.example1.remoteControl;

import structural.bridge.src.example1.entertainmentDevice.EntertainmentDevice;

public abstract class RemoteButton {
	private EntertainmentDevice entertainmentDevice;
	
	public RemoteButton(EntertainmentDevice entertainmentDevice) {
		this.entertainmentDevice = entertainmentDevice;
	}
	
	public String buttonFivePressed() {
		return entertainmentDevice.buttonFivePressed();
	}

	public String buttonSixPressed() {
		return entertainmentDevice.buttonSixPressed();
	}
	
	public int deviceFeedBack() {
		return entertainmentDevice.deviceFeedBack();
	}
	
	public abstract String buttonNinePressed();
}