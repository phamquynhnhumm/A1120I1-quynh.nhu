package LTM.Bai3TCP;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket server = new ServerSocket(7979);
            System.out.println("Kết nối thành công");
            int counter = 0;
            while (true) {
                counter++;
                Socket serverClient = server.accept();
                ServerClientThread sct = new ServerClientThread(serverClient, counter);
                sct.start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ServerClientThread extends Thread {
    Socket serverClient;
    int clientNo;
    String squre;

    ServerClientThread(Socket inSocket, int counter) {
        serverClient = inSocket;
        clientNo = counter;

    }

    public void run() {
        try {
            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage = "", serverMessage = "";
            String a;
            do {
                clientMessage = inStream.readUTF();
                System.out.println("CLient gửi cho bạn : " + clientNo + " : " + clientMessage);
                System.out.println(" Nhập tin nhắn :");
                squre = br.readLine();
                outStream.writeUTF(squre);
                outStream.flush();
                Scanner nhapa = new Scanner(System.in);
                System.out.println("Muốn kết thuốc cuộc trò chuyện bạn hãy nhập 'bye");
                a = nhapa.nextLine();
            } while (a.equals("bye"));
            inStream.close();
            outStream.close();
            serverClient.close();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Client -" + clientNo + " exit!! ");
        }
    }
}


