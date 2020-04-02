package TelevisionExample;

public class SmartTelevision extends Television implements AdvanceTVFeatures,CommonTVFeatures, AndroidOS {
	public SmartTelevision()
	{

	}

	@Override
	public int volumeUp() {
		if (volume >= maxVolume) {
			volume = maxVolume;
		} else {
			volume++;
		}
		return volume;
	}

	@Override
	public int volumeDown() {

		if (volume > 0) {
			volume--;
		} else {
			volume = 0;
		}
		return volume;
	}

	@Override
	public void powerOn() {

		power = true;
		System.out.println("TV is on");
	}

	@Override
	public void poweOff() {

		power = false;
		System.out.println("TV is off");
	}

	@Override
	public void tuneChannel(String channel) {

		// Implementation
		System.out.println("Tunning channel");
	}

	@Override
	public void connectHDMI() {
		// TODO Auto-generated method stub
		System.out.println("Connecting HDMI");

	}

	@Override
	public void connectUSB() {
		// TODO Auto-generated method stub
		System.out.println("Connecting USB");

	}

	@Override
	public void connectExternalSpeakers() {
		// TODO Auto-generated method stub
		System.out.println("Connecting Speakers");

	}

	@Override
	public void streamInSD() {
		System.out.println("Streamingin SD");
	}

	@Override
	public void connectEthernetCable() {
		System.out.println("Connecting Ethernet");
	}

	@Override
	public void streamInHD() {
		System.out.println("Streaming in HD");
	}

	@Override
	public void connectDVDPlayer() {
		// TODO Auto-generated method stub
		System.out.println("Connecting DVDPlayer");
		
	}


	@Override
	public void androidOS() {

		System.out.println("Android OS...");

	}

	@Override
	public void checkForOSUpdates() {

	}

	@Override
	public void updateOS() {

	}


}
