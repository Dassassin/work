package day20.problem06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket client = new Socket("localhost", 8888);
            InputStream is = client.getInputStream();
            OutputStream os = client.getOutputStream();
            System.out.print("输入信息:");
            String sc = new Scanner(System.in).nextLine();
            if ("exit".equals(sc)){
                os.close();
                is.close();
                break;
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write(sc);
            bw.newLine();
            bw.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            System.out.printf("服务器返回信息:" + br.readLine());
            System.out.println();
            br.close();
            bw.close();
        }
    }
}
