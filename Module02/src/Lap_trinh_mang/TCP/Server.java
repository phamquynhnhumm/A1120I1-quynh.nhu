package Lap_trinh_mang.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) throws IOException {
        String sentence_from_client;
        String sentence_to_client ;
        String chuoi ;
        ServerSocket  welcomeSocket = new ServerSocket(6543);
        while(true)
        {

            Socket connectionSocket = welcomeSocket.accept();
            XuLy xuLy = new XuLy(connectionSocket);

            xuLy.start();
            return;
        }
    }

}