package day20.problem03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    public static void main(String[] args) throws IOException {
        byte[] buf=new byte[1024];
        //定义一个dategramSocket对象，监听器的端口号为8001
        DatagramSocket ds=new DatagramSocket(2233);
        //定义一个dategramPacket对象，用于接受数据
        DatagramPacket dp=new DatagramPacket(buf, 1024);
        System.out.println("等待接受数据");
        ds.receive(dp);//等待接受数据，如果没有接受数据，会发生阻塞
        String str=new String(dp.getData(), 0, dp.getLength())+"  from"
                +dp.getAddress().getHostAddress()+":"+dp.getPort();
        System.out.println(str);
        ds.close();
    }
}
