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
            // nh???n v???
            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
            // truy???n ??i
            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());
            String client = "", server = "";

            while (!client.equals("0")) {
                client = inStream.readUTF();

                System.out.println("Chu???i t??? Client1 " + clientNo + " : " + client);


                chuoi = "\nChu???i ?????o ng?????c: " + serverThread.DaoNguoc(client)
                        + "\nChu???i hoa: " + serverThread.InHoa(client)
                        + "\nChu???i th?????ng: " + serverThread.Thuong(client)
                        + "\nChu???i v???a hoa v???a th?????ng: " + serverThread.VuaHoaVuaThuong(client)
                        + "\nS??? t??? trong chu???i: " + serverThread.DemChu(client)
                        + "\nS??? nguy??n ??m: " + serverThread.DemAm(client);
                outStream.writeUTF(chuoi);
                outStream.flush();
            }
            inStream.close();

            outStream.close();
            serverClient.close();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Client -" + clientNo + " tho??t!! ");
        }
    }
}
