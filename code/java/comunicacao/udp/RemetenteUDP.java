package comunicacao.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class RemetenteUDP {
    public static void main(String[] args) {
        try {
            InetAddress endereco = InetAddress.getLocalHost();

            String msg = "Envio de mensagem atraves do protocolo UDP";
            byte[] msgByte = msg.getBytes();

            DatagramPacket pacote = new DatagramPacket(msgByte, msg.length(), endereco, 8000);
            DatagramSocket socket = new DatagramSocket();

            socket.send(pacote);

            System.out.println("Pacote enviado para:" + pacote.getAddress() + "\n" + "Mensagem: " + new String(pacote.getData()).trim() + "\n");

            socket.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
