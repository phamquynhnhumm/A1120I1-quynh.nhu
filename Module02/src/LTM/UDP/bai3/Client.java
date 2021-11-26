package LTM.UDP.bai3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("127.0.0.1");
        byte[] sendData = new byte[4096];
        byte[] receiveData = new byte[4096];

        do {
            System.out.println("Nhập tin nhắn : ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            sendData = bufferedReader.readLine().getBytes();
            // tao datagram co noi dung yeu cau loai du lieu de gui cho server
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 7979);
            datagramSocket.send(sendPacket); // gui du lieu cho server
            // tao datagram  nhan du lieu
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            // nhan du lieu tu server
            datagramSocket.receive(receivePacket);
            String str = new String(receivePacket.getData());
            System.out.println(" Servler trả lời :" + str);
        } while (true);
    }
}




