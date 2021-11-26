package LTM.UDP.bai2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Stack;

public class ServerClientThread  extends  Thread{
    private int count;
    private DatagramSocket datagramSocket;
    byte[] sendData = new byte[4096];
    byte[] receiveData = new byte[4096];
    public ServerClientThread(DatagramSocket datagramSocket, int count) {
        this.datagramSocket = datagramSocket;
        this.count = count;
    }
    public static int ThuTu(Character n) {
        if (n == '^' || n == '%') return 3;
        if (n == '*' || n == '/') return 2;
        if (n == '+' || n == '-') return 1;
        return 0;
    }

    public static String HauTo(String n) {
        Stack<Character> Sh = new Stack<Character>();
        String kq = "";
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) >= '0' && n.charAt(i) <= '9') kq += n.charAt(i);
            else if (n.charAt(i) == '(') Sh.push(n.charAt(i));
            else if (n.charAt(i) == ')') {
                while (!Sh.empty() && Sh.peek() != '(') {
                    kq += Sh.peek();
                    Sh.pop();
                }
                Sh.pop();
            } else if (n.charAt(i) == '+' || n.charAt(i) == '-' || n.charAt(i) == '*' || n.charAt(i) == '/' || n.charAt(i) == '^' || n.charAt(i) == '%') {
                if (n.charAt(i - 1) >= '0' && n.charAt(i - 1) <= '9') kq += "#";
                while (!Sh.empty() && ThuTu(Sh.peek()) >= ThuTu(n.charAt(i))) {
                    kq += Sh.peek();
                    Sh.pop();
                }
                Sh.push(n.charAt(i));
            }
        }

        while (!Sh.empty()) {
            if (Sh.peek() != '(') kq += Sh.peek();
            Sh.pop();
        }
        return kq;
    }

    public static String Tinh(String n) {
        Stack<Double> Sh = new Stack<Double>();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '+' || n.charAt(i) == '-' || n.charAt(i) == '*' || n.charAt(i) == '/' || n.charAt(i) == '^' || n.charAt(i) == '%') {
                double a = Sh.peek();
                Sh.pop();
                double b = Sh.peek();
                Sh.pop();
                double kq = 0;
                if (n.charAt(i) == '+') kq = a + b;
                else if (n.charAt(i) == '-') kq = b - a;
                else if (n.charAt(i) == '*') kq = a * b;
                else if (n.charAt(i) == '/') kq = b / a;
                else if (n.charAt(i) == '%') kq = b % a;
                else if (n.charAt(i) == '^') {
                    kq = b;
                    for (int j = 0; j < (int) a - 1; j++) {
                        kq *= b;
                    }
                }
                Sh.push(kq);
            } else {
                double kq = 0;
                while (i < n.length() && n.charAt(i) >= '0' && n.charAt(i) <= '9') {
                    kq = 10 * kq + (double) (n.charAt(i) - '0');
                    i++;
                }
                if (n.length() != i && n.charAt(i) != '#') i--;
                Sh.push(kq);
            }
        }
        return Sh.peek().toString();
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
                sendData = ("kết quả : " + serverClientThread.Tinh(serverClientThread.HauTo(request))).getBytes();

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
