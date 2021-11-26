package Lap_trinh_mang.Xoan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client {
    public static JTextField textField;
    public static JButton btnSend;
    public static JTextArea textArea;

    private String host;
    private int port;

    Client(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost", 1995);
        client.GUI();
    }

    public void GUI() throws IOException {
        JFrame f = new JFrame();
        textField = new JTextField();
        btnSend = new JButton("SEND");
        textArea = new JTextArea();

        Socket socket = new Socket(host, port);
        ReadClient read = new ReadClient(socket);
        read.start();

        btnSend.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                DataOutputStream dos;
                try {
                    dos = new DataOutputStream(socket.getOutputStream());
                    dos.writeUTF(textField.getText());
                    dos.flush();
                    textField.setText("");
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        });

        textArea.setBounds(10, 10, 380, 300);
        textField.setBounds(10, 320, 300, 40);
        btnSend.setBounds(320, 320, 70, 40);

        f.add(textField); f.add(btnSend); f.add(textArea);
        f.setSize(410, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    class ReadClient extends Thread{
        private Socket client;

        public ReadClient(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            DataInputStream dis = null;
            try {
                while(true) {
                    dis = new DataInputStream(client.getInputStream());
                    String sms = dis.readUTF();
                    Client.textArea.setText(sms);
                }
            } catch (Exception e) {
                try {
                    dis.close();
                    client.close();
                } catch (IOException ex) {
                    System.out.println("Ngắt kết nối Server");

                }
            }
        }
    }
}
