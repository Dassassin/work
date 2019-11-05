package day20.problem07;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        Socket socket = new Socket("localhost", 2233);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] b = new byte[1024 * 8 ];
        int len ;
        while (( len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        socket.shutdownOutput(); System.out.println("文件发送完毕");
        InputStream in = socket.getInputStream();
        byte[] back = new byte[20];
        in.read(back);
        System.out.println(new String(back));
        in.close();
        socket.close();
        bis.close();
    }
}
