package day20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                Socket server = ss.accept();
                InputStream is = null;
                OutputStream os = null;
                BufferedReader br = null;
                BufferedWriter bw = null;
                is = server.getInputStream();
                os = server.getOutputStream();

                br = new BufferedReader(new InputStreamReader(is));
                System.out.printf(server.getRemoteSocketAddress()+":"+br.readLine());
                System.out.println();

                PrintWriter pw = new PrintWriter(os);
                System.out.println("输入回复信息:");
                String msg = new Scanner(System.in).nextLine();

                pw.write(msg);
                pw.flush();
                pw.close();
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
