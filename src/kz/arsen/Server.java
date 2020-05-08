package kz.arsen;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8888);
            while(true){
                System.out.println("Waiting clients");
                Socket socket =serverSocket.accept();
                System.out.println("Client Connectedd");

                ServerThread st=new ServerThread(socket);
                st.start();
            }



        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
