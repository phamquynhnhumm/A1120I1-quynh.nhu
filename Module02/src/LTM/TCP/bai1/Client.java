package LTM.TCP.bai1;

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

            int a;


            String client = "";
            String server = "";
            do {
                System.out.print("Nhập vào chuỗi : ");
                client = bufferedReader.readLine();
                //lấy giá trị client đã nhập gửi đi
                outStream.writeUTF(client);
                //xóa bộ nhớ đệm
                outStream.flush();
                //lấy dữ liệu từ server
                server = inStream.readUTF();

                System.out.println(server);
                System.out.print("Nhập 1 để tiếp tục chương trình, 0 để thoát khỏi chương trình : ");
                Scanner nhapa = new Scanner(System.in);
                a = nhapa.nextInt();
            } while (a != 0);
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
