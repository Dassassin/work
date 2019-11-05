package day20.problem03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        DatagramSocket ds=new DatagramSocket(3000);
        String str="hello world!";//要发送的数据
        /**
         * 创建一个要发送的数据包，数据包包括发送的数据，数据的长度，接收端的ip地址和端口号
         */
        DatagramPacket dp=new DatagramPacket(str.getBytes(),
                str.length(), InetAddress.getByName("localhost"),2233);
        System.out.println("发送信息");
        ds.send(dp);
        ds.close();
    }
}
