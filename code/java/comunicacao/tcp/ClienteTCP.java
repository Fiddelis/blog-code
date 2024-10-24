package comunicacao.tcp;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ClienteTCP {
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("Fiddelis", 8000);
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            Date data_servidor = (Date) entrada.readObject();

            System.out.println("Data recebida do servidor: " + data_servidor);

            entrada.close();
            cliente.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
