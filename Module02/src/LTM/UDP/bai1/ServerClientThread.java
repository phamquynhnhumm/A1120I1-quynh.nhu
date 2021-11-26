package LTM.UDP.bai1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class ServerClientThread extends Thread {

    private int count;
    private DatagramSocket datagramSocket;
    byte[] sendData = new byte[4096];
    byte[] receiveData = new byte[4096];

    public ServerClientThread(DatagramSocket datagramSocket, int count) {
        this.datagramSocket = datagramSocket;
        this.count = count;
    }

    public String DaoNguoc(String str) {
        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char s = str.charAt(i);
            a += (char) s;
        }
        return a;
    }

    public String InHoa(String m) {
        String a = "";
        for (int i = 0; i < m.length(); i++) {
            int s = m.charAt(i);
            if (s > 96 && s < 123) {
                s = s - 32;
            }
            a += (char) s;
        }
        return a;
    }

    public String Thuong(String str) {
        String a = "";
        for (int i = 0; i < str.length(); i++) {
            int s = str.charAt(i);
            if (s > 64 && s < 91) {
                s += 32;
            }
            a += (char) s;
        }
        return a;
    }

    public String VuaHoaVuaThuong(String str) {
        String a = "";
        for (int i = 0; i < str.length(); i++) {
            int s = str.charAt(i);
            if (s > 96 && s < 123) {
                s -= 32;
            } else if (s > 64 && s < 91) {
                s += 32;
            }
            a += (char) s;
        }
        return a;
    }

    public int DemChu(String str) {
        int count;
        if (str.charAt(0) != ' ') {
            count = 1;
        } else {
            count = 0;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    public int DemAm(String str) {
        int count = 0;
        String ss = str.toLowerCase();
        for (int i = 0; i < ss.length(); i++) {
            char s = ss.charAt(i);
            if (s == 'u' || s == 'i' || s == 'a' || s == 'e' || s == 'o') {
                count++;
            }
        }
        return count;
    }
    public void run() {
        try {
            ServerClientThread serverClientThread = new ServerClientThread(datagramSocket, count);
            while (true) {
                // Tạo gói datagram để nhận dữ liệu
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                //Nhận dữ liệu từ client
                datagramSocket.receive(receivePacket);
                // Lấy địa chỉ ip của máy client
                InetAddress IPAddress = receivePacket.getAddress();
                //  Lấy port của client
                int port = receivePacket.getPort();

                String request = new String(receivePacket.getData());
                System.out.println(request);
                request = request.trim();
                sendData = ("Chuỗi Hoa: " + serverClientThread.InHoa(request)
                        + "\nChuỗi Thường: " + serverClientThread.Thuong(request)
                        + "\nSố Ký Tự Trong Chuỗi: " + serverClientThread.DemChu(request)).getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                // Gui du lieu lai client
                datagramSocket.send(sendPacket);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Client " + count + " thoát!! ");
        }
    }
}
