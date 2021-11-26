package LTM.Bai3TCP;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        try {
            Socket socket = new Socket("127.0.0.1", 7979);
            System.out.println("Kết nối thành công");
            DataInputStream inStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage = "", serverMessage = "";

            String a;

            do {
                System.out.println("Nhap tin nhan :");
                clientMessage = br.readLine();
                outStream.writeUTF(clientMessage);
                outStream.flush();
                serverMessage = inStream.readUTF();
                System.out.println("Server gửi cho bạn : " + serverMessage);
                Scanner nhapa = new Scanner(System.in);
                System.out.println("Muốn kết thuốc cuộc trò chuyện bạn hãy nhập 'bye");
                a = nhapa.nextLine();
            } while (a.equals("bye"));
            outStream.close();
            inStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
