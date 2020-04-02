package TelevisionExample;

public class ConnectDVD implements  Connection{

    Connection connection;

    public ConnectDVD(Connection connection)
    {
        this.connection=connection;
    }


    @Override
    public void connect() {
        System.out.println("DVD Connected");
    }

    @Override
    public void disConnect() {
        System.out.println("DVD Disconnected");
    }
}
