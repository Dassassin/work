package day20.problem09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2233);
        while (true) {
            Socket accept = serverSocket.accept();
            new Thread(() -> {
                try {
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c.jpg")); // 1.2 创建输出流,写到服务端 Socket socket = new Socket("localhost", 6666);
                    BufferedOutputStream bos = new BufferedOutputStream(accept.getOutputStream());
                    byte[] b = new byte[1024 * 8 ];
                    int len ;
                    while (( len = bis.read(b)) != -1) {
                        bos.write(b, 0, len);
                    }
                    accept.shutdownOutput();
                    System.out.println("文件发送完毕");
                    InputStream in = accept.getInputStream();
                    byte[] back = new byte[20];
                    in.read(back);
                    System.out.println(new String(back));
                    in.close();
                    accept.close();
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
