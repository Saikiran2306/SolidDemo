package TelevisionExample;

public class Test {

    public static void main(String[] args) {

        Television r1 = new LGCRTTv(120, 60, 72, "Black", 100);


        r1.powerOn();
        System.out.println(r1.isTVOn());
        r1.poweOff();

        Connection con = new SamSungSmartTV();
        con = new ConnectDVD(con);
        con.connect();
        con.disConnect();

    }

}
