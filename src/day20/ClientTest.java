package day20;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) {
        try {
            while (true) {
                Socket client = new Socket("localhost", 8888);
                InputStream is = null;
                OutputStream os = null;
                BufferedReader br = null;
                BufferedWriter bw = null;

                is = client.getInputStream();
                os = client.getOutputStream();

                System.out.println("输入信息:");
                String sc = new Scanner(System.in).nextLine();
                bw = new BufferedWriter(new OutputStreamWriter(os));
                bw.write(sc);
                bw.newLine();
                bw.flush();

                br = new BufferedReader(new InputStreamReader(is));
                System.out.printf("server msg(192.168.0.146):" + br.readLine());
                System.out.println();

                bw.close();
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
