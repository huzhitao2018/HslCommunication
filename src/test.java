import HslCommunication.Profinet.Siemens.SiemensPLCS;
import HslCommunication.Profinet.Siemens.SiemensS7Net;

/**
 * Created by zhitao.hu on 2019-07-19.
 */
public class test {
    public static void main(String[] args) {
        SiemensS7Net siemens_net = new SiemensS7Net(SiemensPLCS.S1200,"192.168.10.180");
//        System.out.println(siemens_net.ReadBool("M30.5").Content);
//        System.out.println(siemens_net.ReadInt16("DB7.4").Content);
//        System.out.println(siemens_net.ReadInt32("DB7.14").Content);
//        System.out.println(siemens_net.ReadInt16("DB7.18").Content);
        siemens_net.Write("DB2.30", (short)101);
//        siemens_net.Write("DB7.18",999);
        System.out.println(siemens_net.ReadInt16("DB2.30").Content);
//        siemens_net.Write("DB7.14",66666);
//        System.out.println(siemens_net.ReadInt32("DB7.14").Content);
    }
}
