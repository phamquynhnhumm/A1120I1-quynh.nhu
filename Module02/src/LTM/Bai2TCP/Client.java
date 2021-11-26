package LTM.Bai2TCP;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);

            //lấy dữa liệu từ socket từ server về clinet
            DataInputStream inStream = new DataInputStream(socket.getInputStream());
            // truyền giá trị nhập vào socket gửi lên server
            DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
            // đường ống để nhập
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage = "",  serverMessage = "";
            int a ;
            do {
                System.out.println("Nhập vào chuỗi:");
                clientMessage = br.readLine();
                outStream.writeUTF(clientMessage);
                // xóa bộ nhớ đệm
                outStream.flush();
                // lấy dữ liệu từ server
                serverMessage = inStream.readUTF();
                System.out.println(serverMessage);
                Scanner nhapa= new Scanner(System.in);
                System.out.println("Nhập 0 để thoát khỏi chương trình , 1 để tiếp tục nhập");
                a = nhapa.nextInt();
            } while (a != 0);

            outStream.close();
            inStream.close();
            socket.close();
        }catch(
                Exception e)

        {
            System.out.println(e);
        }
    }
}
