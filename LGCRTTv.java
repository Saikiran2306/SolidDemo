package TelevisionExample;

public class LGCRTTv extends CRTTelevision implements CommonTVFeatures {
    public LGCRTTv()
    {

    }

    public LGCRTTv(double width, double height, double screenSize, String color, int maxVolume) {
        setWidth(width);
        setHeight(height);
        setScreenSize(screenSize);
        setColor(color);
        setMaxVolume(maxVolume);
    }


    @Override
    public void connectDVDPlayer() {
        // TODO Auto-generated method stub
        System.out.println("Connecting DVDPlayer");

    }

    @Override
    public void connectExternalSpeakers() {
        System.out.println("Connecting Speakers");
    }

    @Override
    public void streamInSD() {
        System.out.println("Streaming SD");
    }


}
