package LTM.UDP.bai2;



import LTM.UDP.bai2.ServerClientThread;

import java.io.IOException;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) {
        int count = 1;
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(7979);
            System.out.println("Kết nối thành công ... ");
            while (true) { // Tạo gói tin nhận
                count++;
                ServerClientThread thread = new ServerClientThread(datagramSocket,count);

                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }

    }
}
