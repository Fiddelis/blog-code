package comunicacao.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceptorUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(8000);
            byte[] msgByte = new byte[400];

            DatagramPacket pacote = new DatagramPacket(msgByte, msgByte.length);
            socket.receive(pacote);

            System.out.println(new String(pacote.getData()).trim());

            socket.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
