package Lap_trinh_mang.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String argv[]) throws Exception
    {
        String sentence_to_server;
        String sentence_from_server;
        Scanner n = new Scanner(System.in);
        System.out.println("hãy nhập vào chuỗi bạn muốn gửi đi  :");


        //Tạo Inputstream(từ bàn phím)
        String chuoi = n.nextLine();
//        BufferedReader inFromUser =
//                new BufferedReader(new InputStreamReader(System.in));
//        //Lấy chuỗi ký tự nhập từ bàn phím
//        sentence_to_server = inFromUser.readLine();nhap tu ban phim
////
        //Tạo socket cho client kết nối đến server qua ID address và port number
        Socket clientSocket = new Socket("127.0.0.1", 6543);

        //Tạo OutputStream nối với Socket
        DataOutputStream guidi =
                new DataOutputStream(clientSocket.getOutputStream());

        //Tạo inputStream nối với Socket

        BufferedReader nhanve =
                new BufferedReader(new
                        InputStreamReader(clientSocket.getInputStream()));
//
        //Gửi chuỗi ký tự tới Server thông qua outputStream đã nối với Socket (ở trên)
        guidi.writeBytes(chuoi + '\n');

        //Đọc tin từ Server thông qua InputSteam đã nối với socket
//        sentence_from_server = nhanve.readLine();

        //print kết qua ra màn hình
//       System.out.println("FROM SERVER: " + sentence_from_server);

        //Đóng liên kết socket
        clientSocket.close();
    }

}
