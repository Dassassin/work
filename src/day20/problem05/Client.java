package day20.problem05;

import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 8888);
        OutputStream os = client.getOutputStream();
        os.write(" hello.服务器,我是客户端".getBytes());
        os.close();
        client.close();
    }
}
