package LTM.TCP.bai3;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 7979);
            //lấy dữa liệu từ socket từ server về clinet
            DataInputStream inStream = new DataInputStream(socket.getInputStream());
            // truyền giá trị nhập vào socket gửi lên server
            DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String a;
            String client = "";
            String server = "";
            do {
                System.out.print("Nhap tin nhan :");
                client = bufferedReader.readLine();
                outStream.writeUTF(client);
                outStream.flush();
                server = inStream.readUTF();
                System.out.println("Server gửi cho bạn : " + server);
                Scanner nhapa = new Scanner(System.in);
                System.out.println("Muốn kết thuốc cuộc trò chuyện bạn hãy nhập 'bye', 'no' để tiếp tục cuộc trò chuyện");
                a = nhapa.nextLine();
            } while (!a.equals("bye"));
            outStream.close();
            inStream.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

