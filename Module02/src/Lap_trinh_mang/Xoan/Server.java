package Lap_trinh_mang.Xoan;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;

    Server(int port)
    {
        this.port = port;
    }

    public void excute() throws IOException
    {
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();
        Read_Write rw = new Read_Write(socket);
        rw.start();
    }
    class Read_Write extends Thread{
        private Socket socket;

        Read_Write(Socket socket)
        {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                System.out.println("Server is Running! ");
                System.out.println("đã kết nối với"+ socket);
                while(true)
                {
                    DataInputStream dis = new DataInputStream(socket.getInputStream());
                    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                    String TextIn = dis.readUTF();
                    int countchar = CountChar(TextIn);
                    int countvowel = CountVowel(TextIn);
                    int[] arr = {0,0,0,0,0} ;
                    arr = CountRepeatVowel(TextIn);
                    dos.writeUTF("String after Upper: " + ToUpper(TextIn)+ "\n" +
                            "String after Lower: " + ToLower(TextIn)+ "\n" +
                            "String after Upper & Lower: " + ToUpper_Lower(TextIn)+ "\n" +
                            "Count Char: " + countchar + "\n" +
                            "Count Vowel: " + countvowel + "\n" +
                            "Vowel u repeat:"+ arr[0] + "\n" +  "Vowel e repeat:"+ arr[1] + "\n"+"Vowel o repeat:"+ arr[2] + "\n"+
                            "Vowel a repeat:"+ arr[3] + "\n"+"Vowel i repeat:"+ arr[4] );
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Server sv = new Server(1995);
        sv.excute();
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
    public static String ToLower(String s)
    {
        String result = "";
        for(int i=0; i< s.length(); i++)
        {
            if(s.charAt(i) >= 'A' && s.charAt(i) <='Z')
            {
                char c = (char)((int)s.charAt(i) + 32);
                result += c;
            }
            else
            {
                result += s.charAt(i);
            }
        }
        return result;
    }
    public static String ToUpper_Lower(String s)
    {
        String result = "";
        for(int i=0; i< s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z')
            {
                char c = (char)((int)s.charAt(i) - 32);
                result += c;
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <='Z')
            {
                char c = (char)((int)s.charAt(i) + 32);
                result += c;
            }
            else
            {
                result += s.charAt(i);
            }
        }
        return result;
    }
    public static int CountChar(String s)
    {
        int countchar = 1;
        for(int i = 0; i< s.length(); i++)
        {
            if(s.charAt(i) == ' ')
                countchar++;
        }
        return countchar;
    }
    public static int CountVowel(String s)
    {
        int countvowel = 1;
        for(int i = 0; i< s.length(); i++)
        {
            if(s.charAt(i) == 'u' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'i')
                countvowel++;
        }
        return countvowel;
    }
    public static int[] CountRepeatVowel(String s)
    {
        int[] arr = new int[5];
        for(int i = 0; i< s.length(); i++)
        {
            if(s.charAt(i) == 'u' || s.charAt(i) == 'U')
                arr[0]++;
            if(s.charAt(i) == 'e' || s.charAt(i) == 'E')
                arr[1]++;
            if(s.charAt(i) == 'o' || s.charAt(i) == 'o')
                arr[2]++;
            if(s.charAt(i) == 'a' || s.charAt(i) == 'a')
                arr[3]++;
            if(s.charAt(i) == 'i' || s.charAt(i) == 'I')
                arr[4]++;
        }
        return arr;
    }
}
