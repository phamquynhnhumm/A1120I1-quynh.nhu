package LTM.bai1;


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

            String clientMessage = "", clientMessage1 = "", serverMessage = "", serverMessage1 = "";
            int a;
            do {

                System.out.println("Nhap so a:");
                clientMessage = br.readLine();
                System.out.println("Nhap so b :");
                clientMessage1 = br.readLine();
                outStream.writeUTF(clientMessage);
                outStream.writeUTF(clientMessage1);
                // xóa bộ nhớ đệm
                outStream.flush();
                // lấy dữ liệu từ server
                serverMessage = inStream.readUTF();
                serverMessage1 = inStream.readUTF();
                System.out.println("Tổng là"
                );
                System.out.println(serverMessage);
                System.out.println("Hiêu là :");
                System.out.println(serverMessage1);
                System.out.println("Nhập 0 để thoát khỏi chương trình");
                Scanner nhap = new Scanner(System.in);
                a = nhap.nextInt();

            } while (a !=0);


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

