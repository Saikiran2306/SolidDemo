package TelevisionExample;

public class SamSungSmartTV extends SmartTelevision implements Connection {

    public SamSungSmartTV() {

    }

    public SamSungSmartTV(double width, double height, double screenSize, String color, int maxVolume) {
        setWidth(width);
        setHeight(height);
        setScreenSize(screenSize);
        setColor(color);
        setMaxVolume(maxVolume);

    }

    public void connect() {
        System.out.println("HDMI Connected");
    }

    @Override
    public void disConnect() {
        System.out.println("HDMI Disconnected");
    }
}
