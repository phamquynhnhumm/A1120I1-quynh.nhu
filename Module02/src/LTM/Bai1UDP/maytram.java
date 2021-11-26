package LTM.Bai1UDP;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class maytram {
    private InetAddress host;
    private int port;

    public maytram(InetAddress host, int port) {
        this.host = host;
        this.port = port;
    }
    private void execute() throws IOException {

        DatagramSocket client = new DatagramSocket();


//		System.out.print("Nhap ten cua ban: ");
//
//		 String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
//
//		client.send(createPacket(s + " da tham gia phong chat!"));

        ReadClient read = new ReadClient(client);
        read.start();
        WriteClient write = new WriteClient(client, host, port);
        write.start();
    }

    public static void main(String[] args) throws IOException {
        maytram client = new maytram(InetAddress.getLocalHost(), 3344);
        client.execute();
    }

    private DatagramPacket createPacket(String value) {
        byte[] arrData = value.getBytes();
        return new DatagramPacket(arrData, arrData.length, host, port);
    }
}

class ReadClient extends Thread{
    private DatagramSocket client;

    public ReadClient(DatagramSocket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            while(true) {
                String sms = recieveData(client);
                System.out.println(sms);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private String recieveData(DatagramSocket client) throws IOException {
        byte[] temp = new byte[1024];
        DatagramPacket recieve_Packet = new DatagramPacket(temp, temp.length);
        client.receive(recieve_Packet);
        return new String(recieve_Packet.getData()).trim();
    }
}


class WriteClient extends Thread{
    private DatagramSocket client;
    private InetAddress host;
    private int port;


    public WriteClient(DatagramSocket client, InetAddress host, int port) {
        this.client = client;
        this.host = host;
        this.port = port;

    }

    @Override
    public void run() {

        while(true) {
            try {
                String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
                DatagramPacket DP = createPacket(s);
                client.send(DP);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    private DatagramPacket createPacket(String value) {
        byte[] arrData = value.getBytes();
        return new DatagramPacket(arrData, arrData.length, host, port);
    }
}

