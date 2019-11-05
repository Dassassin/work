package day20.problem08;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket client = new Socket("localhost", 2233);
            System.out.println("输入用户名和密码（用户名=密码）:");
            String sc = new Scanner(System.in).nextLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            bw.write(sc);
            bw.newLine();
            bw.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.printf(br.readLine());
            System.out.println();
            bw.close();
            br.close();
        }
    }
}
