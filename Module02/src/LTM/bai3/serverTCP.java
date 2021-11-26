package LTM.bai3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class serverTCP {
    public static void main(String argv[]) throws Exception {
        String sentence_from_client;
        String sentence_to_client;

        //Tạo socket server, chờ tại cổng '6543'
        ServerSocket welcomeSocket = new ServerSocket(6543);

        while (true) {
            //chờ yêu cầu từ client
            Socket connectionSocket = welcomeSocket.accept();

            //Tạo input stream, nối tới Socket
            BufferedReader inFromClient =
                    new BufferedReader(new
                            InputStreamReader(connectionSocket.getInputStream()));

            //Tạo outputStream, nối tới socket
            DataOutputStream outToClient =
                    new DataOutputStream(connectionSocket.getOutputStream());

            //Đọc thông tin từ socket
            sentence_from_client = inFromClient.readLine();

            sentence_to_client = sentence_from_client + " (Server accepted!)" + '\n';
            //ghi dữ liệu ra socket
            outToClient.writeBytes(ToUpper(sentence_from_client));
            outToClient.writeBytes(ToLower(sentence_from_client));
            System.out.println("in ra chuỗi" + ToUpper(sentence_from_client) + ToLower(sentence_from_client));
            return ;
        }
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

