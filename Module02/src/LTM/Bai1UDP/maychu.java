package LTM.Bai1UDP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;




public class maychu {
    private int port;
    private InetAddress clientIP;
    private int clientPort;


    public maychu(int port) {
        this.port = port;
    }

    public static String daochu(String m) {
        String n = "Chuoi sau sau khi dao: ";
        for(int i = m.length() - 1 ; i >= 0  ; i--) {
            n += m.charAt(i);
        }
        n += "\n";
        return n;
    }
    public static String inhoa(String m) {
        String n = "Chuoi sau sau in hoa: ";
        for(int i = 0 ; i < m.length()  ; i++) {

            if(m.charAt(i) >= 'a' && m.charAt(i) <= 'z')
                n += (char)(m.charAt(i) - 32);
            else n += m.charAt(i);
        }
        n += "\n";
        return n;
    }
    public static String inthuong(String m) {
        String n = "Chuoi sau sau in thuong: ";
        for(int i = 0 ; i < m.length()  ; i++) {

            if(m.charAt(i) >= 'A' && m.charAt(i) <= 'Z')
                n += (char)(m.charAt(i) + 32);
            else n += m.charAt(i);
        }
        n += "\n";
        return n;
    }
    public static String inhoathuong(String m) {
        String n = "Chuoi sau sau in hoa thuong: ";
        for(int i = 0 ; i < m.length()  ; i++) {

            if(m.charAt(i) >= 'a' && m.charAt(i) <= 'z')
                n += (char)(m.charAt(i) - 32);
            else if(m.charAt(i) >= 'A' && m.charAt(i) <= 'Z')
                n += (char)(m.charAt(i) + 32);
            else n += m.charAt(i);
        }
        n += "\n";
        return n;
    }
    public static String demtu(String m) {
        int n = 0;
        char ch[]= new char[m.length()];
        for(int i = 0 ; i < m.length()  ; i++) {
            ch[i]= m.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                n++;
        }
        String k = "So tu trong chuoi: " + n;
        k += "\n";
        return k;
    }
    public static String demnguyenam(String m) {
        int n = 0;
        char ch[]= new char[m.length()];
        for(int i = 0 ; i < m.length()  ; i++) {
            ch[i]= m.charAt(i);
            if( ch[i] =='u' || ch[i] =='e' ||ch[i] =='o' ||ch[i] =='a' ||ch[i] =='i'  )
                n++;
            else if( ch[i] =='U' || ch[i] =='E' ||ch[i] =='O' ||ch[i] =='A' ||ch[i] =='I'  )
                n++;
        }
        String k = "So nguyen am trong chuoi: " + n;
        k += "\n";
        return k;
    }


    private void execute() throws IOException {

        DatagramSocket server = new DatagramSocket(port);
        System.out.println("Server is listening....");
        while (true) {
            String k = recieveData(server);
            String S = maychu.daochu(k) + maychu.inhoa(k) + maychu.inthuong(k) + maychu.inhoathuong(k) + maychu.demtu(k) + 	maychu.demnguyenam(k) ;
            sendData(S, server, clientIP, clientPort);
//			System.out.println(S);
        }
    }

    public static void main(String[] args) throws IOException {

        maychu server = new maychu(3344);
        server.execute();
    }

    private String recieveData(DatagramSocket server) throws IOException {
        byte[] temp = new byte[1024];
        DatagramPacket recieve_Packet = new DatagramPacket(temp, temp.length);
        server.receive(recieve_Packet);
        clientIP = recieve_Packet.getAddress();
        clientPort = recieve_Packet.getPort();

        return new String(recieve_Packet.getData()).trim();
    }



    private void sendData(String value, DatagramSocket server, InetAddress clientIP, int clientPort)
            throws IOException {
        byte[] temp = new byte[1024];
        temp = value.getBytes();
        DatagramPacket send_result_Packet = new DatagramPacket(temp, temp.length, clientIP, clientPort);
        server.send(send_result_Packet);
    }
}


