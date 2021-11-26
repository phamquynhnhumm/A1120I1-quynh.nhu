package Lap_trinh_mang.TCP;

import _11_map_bst.MyTreeMap;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class XuLy extends  Thread {
    public   String  s;
    public DataOutputStream nhan_diachi;
   public   Socket nhan;

    public XuLy(Socket connectionSocket) {
        this.nhan = connectionSocket;
    }

    public static String ToUpper(String s)
    {
        String result = "";
        for(int i=0; i< s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z')
            {
                char c = (char)((int)s.charAt(i) - 32);
                result += c;
            }
            else
            {
                result += s.charAt(i);
            }
        }
        return result;
    }
    @Override
     public  void run()
    {

        try {

            BufferedReader inFromClient = new BufferedReader((new InputStreamReader(nhan.getInputStream())));
            String sentence_from_client = inFromClient.readLine();
            System.out.println("nhan  " + sentence_from_client);


            System.out.println(" chuỗi  in hoa :");
            System.out.println(  this.ToUpper(sentence_from_client));
            nhan.getInetAddress() ;
            System.out.println(  "oke" + nhan.getInetAddress());

            DataOutputStream outToClient = new DataOutputStream(( nhan.getOutputStream()));
            String kq = "okeeeeeeeeee2";
                outToClient.writeBytes(ToUpper(sentence_from_client));
            System.out.println("okee23");
        } catch (IOException e) {
            e.printStackTrace();
        }

//            outToClient.writeBytes( this.ToUpper(this.s));
//            outToClient.writeBytes("okeeeee");

    }



}
