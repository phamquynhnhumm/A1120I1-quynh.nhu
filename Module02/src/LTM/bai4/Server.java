package LTM.bai4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Nguyen Anh Tuan
 */
public class Server {
    public static void main(String[] args) throws IOException {
        String so1, so2, so3;
        int tong;
        // tao server socket
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Server is now already");
        //tao 1 socket do ket noi tu client toi server
        Socket connectionSocket = server.accept();
        //tao luong nhan du lieu tu client
        DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
        // tao luong gui du lieu toi client
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
        // truyen du lieu tu client vao 2 bien so1 va so2
        so1 = inFromClient.readLine();
        so2 = inFromClient.readLine();
        //ep so1 va so2 tu kieu String sang kieu Integer
        String a =so1;

        String b = so2;
        //tinh tong a + b
        //ep tong 2 so a+b sang kieu String
      //  so3 = String.valueOf(tong);
        //gui so3 ve client
        outToClient.writeBytes(DaoNguoc(so1)+ '\n' +ChuoiHoa(so2));
        outToClient.writeBytes("hic xm ra kq ko" +ChuoiHoa(so2));
        //dong luong nhan du lieu tu client
        inFromClient.close();
        //dong luong gui du lieu ve client
        outToClient.close();
        //dong server socket
        server.close();
    }
    public static String DaoNguoc(String text){
        String result = "";
        for(int i = text.length() - 1; i >=0; i--){
            System.out.println(text.charAt(i));
            result += text.charAt(i);
        }
        System.out.println(result);
        return result;
    }

    public static String ChuoiHoa(String text){
        String result = "";

        for (int i = 0; i<text.length(); i++){
            int num = text.charAt(i);
            if(num >=97 && num <=122){
                num -=32;
            }
            result+=(char)num;
        }
        System.out.println(result);

        return  result;
    }

    public String ChuoiThuong(String text){
        String result = "";

        for (int i = 0; i<text.length(); i++){
            int num = text.charAt(i);
            if(num >=65 && num <=90){
                num += 32;
            }
            result+= (char) num;
        }
        return  result;
    }


    public String ChuoiHoaThuong(String text){
        String result = "";
        for (int i = 0; i<text.length(); i++){
            int num = text.charAt(i);
            if(num >=65 && num <=90){
                num+=32;
            }
            else if(num >=97 && num <=122){
                num-=32;
            }
            result+=(char)num;
        }
        return result;
    }

    public String DemNguyenAm(String text){
        int count = 0;
        for(int i = 0; i<text.length(); i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'i' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'o' ||text.charAt(i) == 'u'
            ){
                count++;
            }
        }
        String result = String.valueOf(count);

        return  result;
    }

    public String DemSoTu(String text){
        int count = 0;
        for(int i = 0; i< text.length(); i++){
            if(text.charAt(i) == ' '){
                continue;
            }
            count++;
        }
        return String.valueOf(count);
    }

}
