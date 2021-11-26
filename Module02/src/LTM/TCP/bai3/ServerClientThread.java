package LTM.TCP.bai3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

class ServerClientThread extends Thread {
    Socket serverClient;
    int clientNo;
    String tinnhan;

    ServerClientThread(Socket inSocket, int counter) {
        serverClient = inSocket;
        clientNo = counter;

    }
    public void run() {
        try {
            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String client = "", server = "";
            String a;
            do {
                client= inStream.readUTF();
                System.out.println("CLient gửi cho bạn : " + clientNo + " : " + client);
                System.out.print(" Nhập tin nhắn :");
                tinnhan = bufferedReader.readLine();
                outStream.writeUTF(tinnhan);
                outStream.flush();
                Scanner nhapa = new Scanner(System.in);
                System.out.print("Muốn kết thuốc cuộc trò chuyện bạn hãy nhập 'bye', 'no' để tiếp tục");
                a = nhapa.nextLine();
            } while (!a.equals("bye"));
            inStream.close();
            outStream.close();
            serverClient.close();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Client -" + clientNo + " thoát! ");
        }
    }
}
