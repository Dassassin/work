package day20.problem09;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.146",8888);
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        FileOutputStream fis = new FileOutputStream(System.currentTimeMillis() + ".jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fis);
        byte[] b = new byte[1024 * 8];
        int len; while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        System.out.println("loading ........");
        OutputStream out = socket.getOutputStream();
        out.write("用户已下载成功".getBytes());
        out.close();
        bos.close();
        bis.close();
        socket.close();
        System.out.println("文件已下载");
    }
}
