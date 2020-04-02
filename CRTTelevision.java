package TelevisionExample;

public class CRTTelevision extends Television {

	public CRTTelevision()
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


	public void PowerOn() {

		power = true;
	}


	public void PoweOff() {

		power = false;
	}

	@Override
	public void tuneChannel(String channel) {

		// Implementation
	}

}
