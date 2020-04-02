package TelevisionExample;

public class ConnectHDMI implements  Connection {

    Connection connection;

    public ConnectHDMI(Connection connection)
    {
        this.connection=connection;
    }


    @Override
    public void connect() {
        System.out.println("HDMI Connected");
    }

    @Override
    public void disConnect() {
System.out.println("HDMI Disconnected");
    }
}
