package LTM.TCP.bai1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ServerClientThread extends Thread {
    Socket serverClient;
    int clientNo;
    String chuoi;

    public ServerClientThread(Socket inSocket, int counter) {
        serverClient = inSocket;
        clientNo = counter;
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
            ServerClientThread serverThread = new ServerClientThread(serverClient, clientNo);
            // nhận về
            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
            // truyền đi
            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());
            String client = "", server = "";

            while (!client.equals("0")) {
                client = inStream.readUTF();

                System.out.println("Chuỗi từ Client1 " + clientNo + " : " + client);


                chuoi = "\nChuỗi đảo ngược: " + serverThread.DaoNguoc(client)
                        + "\nChuỗi hoa: " + serverThread.InHoa(client)
                        + "\nChuỗi thường: " + serverThread.Thuong(client)
                        + "\nChuỗi vừa hoa vừa thường: " + serverThread.VuaHoaVuaThuong(client)
                        + "\nSố từ trong chuỗi: " + serverThread.DemChu(client)
                        + "\nSố nguyên âm: " + serverThread.DemAm(client);
                outStream.writeUTF(chuoi);
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
