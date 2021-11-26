package LTM.TCP.bai2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Stack;

class ServerClientThread extends Thread {
    Socket serverClient;
    int clientNo;
    String kq;

    ServerClientThread(Socket inSocket, int counter) {
        serverClient = inSocket;
        clientNo = counter;

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
            ServerClientThread serverThread = new ServerClientThread(serverClient, clientNo);
            // nhận về
            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
            // truyền đi
            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());
            String client = "", server = "";

            while (!client.equals("0")) {
                client = inStream.readUTF();

                System.out.println("Chuỗi từ Client1 " + clientNo + " : " + client);
                kq = serverThread.Tinh(serverThread.HauTo(client));
                outStream.writeUTF(kq);
                outStream.flush();
            }
            inStream.close();

            outStream.close();
            serverClient.close();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Client -" + clientNo + " thoát!! ");
        }
    }
}