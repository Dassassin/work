package day20.problem08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2233);
        while (true) {
            Socket accept = serverSocket.accept();
            new Thread(() -> {
                try {
                BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                String userMsg = br.readLine();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                String msg = getRegisterResult(userMsg);
                bw.write(msg);
                bw.flush();
                bw.close();
                br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    private static String getRegisterResult(String userMsg) throws IOException {
        String msg = "";
        File file = new File("test.txt");
        Properties properties = new Properties();
        properties.load(new FileInputStream(file));
        Set<String> names = properties.stringPropertyNames();
        String name = userMsg.split("=")[0];
        String password = userMsg.substring(userMsg.lastIndexOf("=") + 1);
        if (names.contains(name)) {
            String pwd = properties.getProperty(name);
            System.out.println("password:" + password);
            System.out.println("pwd:" + pwd);
            if (pwd.equals(password)) {
                msg = "登录成功";
            } else {
                msg = "登录失败";
            }
        } else {
            BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
            bw.write(userMsg);
            bw.newLine();
            bw.flush();
            bw.close();
            msg = "注册成功";
        }
        return msg;
    }
}
