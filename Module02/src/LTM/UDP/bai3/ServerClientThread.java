package LTM.UDP.bai3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerClientThread extends  Thread{
    private int count;
    private DatagramSocket datagramSocket;
    byte[] sendData = new byte[4096];
    byte[] receiveData = new byte[4096];
    public ServerClientThread(DatagramSocket datagramSocket, int count) {
        this.datagramSocket = datagramSocket;
        this.count = count;
    }
    public void run() {
        try {
            ServerClientThread serverClientThread = new ServerClientThread(datagramSocket, count);
            do{
                // Tạo gói datagram để nhận dữ liệu
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                //Nhận dữ liệu từ client
                datagramSocket.receive(receivePacket);
                // Lấy địa chỉ ip của máy client
                InetAddress IPAddress = receivePacket.getAddress();
                //  Lấy port của client
                int port = receivePacket.getPort();

                String request = new String(receivePacket.getData());
                System.out.println( "Client nhắn cho bạn : " +request);


                System.out.println("Nhập tin nhắn : ");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                sendData = bufferedReader.readLine().getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                // Gui du lieu lai client
                datagramSocket.send(sendPacket);
            }while(true);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Client " + count + " thoát!! ");
        }
    }
}
