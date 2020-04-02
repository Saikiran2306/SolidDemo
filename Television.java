package TelevisionExample;

public abstract class Television extends TVDetails implements Remote {

    public Television()
    {

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

	public boolean isTVOn() {
    	if(power==true)
    		return true;
    	return false;
	}

	public boolean isTVOff() {
		if(power==false)
			return true;
		return false;
	}

}
