package LTM.Bai1_UDP;



import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    private int port;
    private InetAddress clientIP;
    private int clientPort;

    public UDPServer(int port) {
        this.port = port;
    }

    private void execute() throws IOException {
        DatagramSocket server = new DatagramSocket(port);
        System.out.println("Server is started ...");
        TinhToan tinhToan = new TinhToan();
        while (true) {
            String request = receiveData(server);
            String response = tinhToan.VietThuong(request) + "\n" + tinhToan.VietHoa(request) + "\n" + tinhToan.DemSoTu(request) + "\n" + tinhToan.DaoNguoc(request) + "\n" + tinhToan.DemNguyenAm(request) + "\n" + tinhToan.ChuoiHoaThuong(request);
            sendData(response, server, clientIP, clientPort);
        }
    }

    private String receiveData(DatagramSocket server) throws IOException {
        byte[] receive = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receive, receive.length);
        server.receive(receivePacket);
        clientIP = receivePacket.getAddress();
        clientPort = receivePacket.getPort();

        return new String(receivePacket.getData()).trim();
    }

    private void sendData(String value, DatagramSocket server,  InetAddress clientIP, int clientPort) throws IOException {
        byte[] send = new byte[1024];
        send = value.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(send, send.length, clientIP, clientPort);
        server.send(sendPacket);
    }

    public static void main(String[] args) throws IOException {
        UDPServer server = new UDPServer(7788);
        server.execute();
    }
}

class TinhToan {
    public String VietThuong(String text){
        String result = "";
        for(int i = 0; i<text.length(); i++){
            int ch = text.charAt(i);
            if(ch >= 65 && ch <= 90){
                ch += 32;
            }
            result += (char) ch;
        }
        return "Chuoi Viet Thuong: " + result;
    }

    public String VietHoa(String text){
        String result = "";
        for(int i = 0; i<text.length(); i++){
            int ch = text.charAt(i);
            if(ch <= 122 && ch >= 97){
                ch -= 32;
            }

            result += (char) ch;
        }
        return "Chuoi Viet Hoa: " + result;
    }

    public String DemSoTu(String text){
        int count = 0;
        for(int i = 0; i< text.length(); i++){
            if(text.charAt(i) == ' '){
                continue;
            }
            count++;
        }
        return "So Tu: " + String.valueOf(count);
    }

    public String DaoNguoc(String text){
        String result = "";
        for(int i = text.length() - 1; i >=0; i--){
            System.out.println(text.charAt(i));
            result += text.charAt(i);
        }
        System.out.println(result);
        return "Chuoi Dao Nguoc: " + result;
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

        return "So Nguyen Am: " + result;
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
        return "Chuoi Vua Hoa Vua Thuong: " + result;
    }
}

