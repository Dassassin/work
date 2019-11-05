package day20.problem06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket server = ss.accept();
            InputStream is = server.getInputStream();
            OutputStream os = server.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            System.out.println("接收到客户端发送的信息:"+br.readLine());
            PrintWriter pw = new PrintWriter(os);
            pw.write("消息已收到");
            pw.close();
            br.close();
            os.close();
            is.close();
        }
    }
}
