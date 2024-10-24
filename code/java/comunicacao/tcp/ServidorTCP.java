package comunicacao.tcp;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServidorTCP {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            // Interrompe a aplicação até um cliente se conectar
            Socket cliente = serverSocket.accept();
            System.out.println("IP do cliente conectado:" + cliente.getInetAddress().getHostAddress());

            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());

            saida.writeObject(new Date());
            saida.flush(); // garante que todos os dados serializados sejam enviados imediatamente ao destino

            saida.close();
            cliente.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}