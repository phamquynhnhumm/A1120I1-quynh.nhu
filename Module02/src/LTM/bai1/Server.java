package LTM.bai1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */

import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws Exception {
        try{
            // tạo socket để kết nối với clinet
            ServerSocket server=new ServerSocket(8888);
            int counter=0;
            System.out.println("Đã kết nối thành công ....");
            while(true){
                counter++;
                Socket serverClient=server.accept();  //server accept the client connection request
                // tạo nhiều client
                ServerClientThread sct = new ServerClientThread(serverClient,counter); //send  the request to a separate thread
              // bắt đầu chạy
                sct.start();

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class ServerClientThread extends Thread {
    Socket serverClient;
    int clientNo;
    String squre;
    ServerClientThread(Socket inSocket,int counter){
        serverClient = inSocket;
        clientNo=counter;

    }
    public String DaoNguoc(String str) {
        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char s = str.charAt(i);
            a+=(char)s;
        }
        return a;
    }

    public String ThuongHoa(String m){
        String a = "";
        for (int i = 0; i < m.length(); i++) {
            int s = m.charAt(i);
            if (s > 96 && s < 123) {
                s = s - 32;
            }
            a+=(char)s;
        }
        return a;
    }

    public String HoaThuong(String str) {
        String a = "";
        for (int i = 0; i < str.length(); i++) {
            int s = str.charAt(i);
            if (s > 64 && s < 91) {
                s += 32;
            }
            a+=(char)s;
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
            a+=(char)s;
        }
        return a;
    }
    public int WordCount(String str) {
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

    public int VowelsCount(String str) {
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
    public void run(){
        try{
            ServerClientThread serverThread = new ServerClientThread(serverClient, clientNo);
            // nhận về
            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
            // truyền đi
            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());
            String clientMessage="",clientMessage1="", serverMessage="";
            while(!clientMessage.equals("bye")){
                clientMessage=inStream.readUTF();
                clientMessage1=inStream.readUTF();

                System.out.println("Chuoi tu Client1 "+clientNo+" : "+clientMessage  + "chuoi so 2" + clientMessage1);
                int tong = (Integer.parseInt(clientMessage) + Integer.parseInt(clientMessage1));
                int hieu = (Integer.parseInt(clientMessage) - Integer.parseInt(clientMessage1));

                System.out.println(tong);

//                squre = "\nChuoi dao nguoc: " + serverThread.DaoNguoc(clientMessage) + "\nChuoi hoa: " + serverThread.ThuongHoa(clientMessage)
//                        + "\nChuoi thuong: " + serverThread.HoaThuong(clientMessage) + "\nSo tu trong chuoi: " + serverThread.WordCount(clientMessage)
//                        + "\nSo nguyen am: " + serverThread.VowelsCount(clientMessage);
                   outStream.writeUTF(String.valueOf(tong));
                outStream.writeUTF(String.valueOf(hieu));
                outStream.flush();
            }
            inStream.close();


            outStream.close();
            serverClient.close();
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
            System.out.println("Client -" + clientNo + " exit!! ");
        }
    }
}

