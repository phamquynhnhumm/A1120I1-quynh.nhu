package LTM.TCP.bai1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        try{
            // tạo socket để kết nối với clinet
            ServerSocket server=new ServerSocket(7979);
            int counter=0;
            System.out.println("Đã kết nối thành công ....");
            while(true){
                counter++;
                Socket serverClient=server.accept();  //server accept the client connection request
                // tạo nhiều client
                ServerClientThread sct = new  ServerClientThread(serverClient,counter); //send  the request to a separate thread
                // bắt đầu chạy
                sct.start();

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
