package TelevisionExample;

public class TVDetails {

    private double width;
    private double height;
    private double screenSize;
    int volume;
    int maxVolume;
    boolean power;
    private String color;

    public TVDetails() {

    }

    public TVDetails(double width, double height, double screenSize, String color, int maxVolume) {
        this.width = width;
        this.height = height;
        this.screenSize = screenSize;
        this.color = color;
        this.maxVolume = maxVolume;
    }

    void setMaxVolume(int maxVolume1) {
        maxVolume = maxVolume1;
    }

    void setHeight(double height1) {
        height = height1;
    }

    void setWidth(double width1) {
        width = width1;
    }

    void setScreenSize(double screenSize1) {
        screenSize = screenSize1;
    }

    void setColor(String color1) {
        color = color1;
    }


    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getColor() {
        return color;
    }

    int getMaxVolume() {
        return maxVolume;
    }

    double getScreenSize() {
        return screenSize;
    }
}
