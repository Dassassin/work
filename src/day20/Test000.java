package day20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test000 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket accept = ss.accept();
//            new Thread(() -> {
                try {
                    InputStream is = accept.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String line = "";
                    line = br.readLine();
                    String[] arr = line.split(" ");
                    String path = arr[1].substring(1);
                    String replace = path.replace("/", "\\");
                    FileInputStream fis = new FileInputStream(replace);
                    int len;
                    byte[] bytes = new byte[1024];
                    OutputStream os = accept.getOutputStream();
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
                    os.write("HTTP/1.1 200 OK\r\n".getBytes());
                    os.write("text/html; charset=utf-8".getBytes());
                    os.write("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3\r\n".getBytes());
                    os.write("\r\n".getBytes());
                    while ((len = fis.read(bytes)) != -1) {
                        os.write(bytes,0,len);
                    }
                    bw.close();
                    fis.close();
                    os.close();
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
//            }).start();
        }
    }
}
