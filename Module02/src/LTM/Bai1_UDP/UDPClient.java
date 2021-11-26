package LTM.Bai1_UDP;


import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    private InetAddress host;
    private int port;

    public UDPClient(InetAddress host, int port){
        this.port = port;
        this.host = host;
    }

    private void execute() throws IOException {
        DatagramSocket client = new DatagramSocket();
        ReadClient read = new ReadClient(client);
        read.start();
        WriteClient write = new WriteClient(client, host, port);
        write.start();

    }
    public static void main(String[] args) throws IOException {
        UDPClient client = new UDPClient(InetAddress .getLocalHost(), 7788);
        client.execute();
    }
}


class ReadClient extends Thread {
    private DatagramSocket client;

    public ReadClient(DatagramSocket client){
        this.client = client;
    }

    public void run() {
        try {
            while (true){
                String result = receiveData(client);
                System.out.println(result);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    private String receiveData(DatagramSocket client) throws IOException {
        byte[] receive = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receive, receive.length);
        client.receive(receivePacket);
        return new String(receivePacket.getData()).trim();
    }
}

class WriteClient extends Thread {
    private DatagramSocket client;
    private InetAddress host;
    private int port;

    public WriteClient(DatagramSocket client, InetAddress host, int port){
        this.client = client;
        this.host = host;
        this.port = port;
    }

    public void run() {
        while (true){
            try {
                String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
                DatagramPacket sendPacket =createPacket(input);
                client.send(sendPacket);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private DatagramPacket createPacket(String value) {
        byte[] arrData = value.getBytes();
        return new DatagramPacket(arrData, arrData.length, host, port);
    }
}