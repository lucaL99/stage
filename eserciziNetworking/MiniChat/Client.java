import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.139", 5200);
            System.out.println("Digita 'stop' per far rispondere il destinatario");
            while (true) {

                BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                PrintWriter toServer = new PrintWriter(socket.getOutputStream(), true);

                InputStreamReader isr = new InputStreamReader(System.in);

                BufferedReader stdIn = new BufferedReader(isr);

                String fromUser = "", stringFromServer = "";

                while (!fromUser.equals("stop")) {
                    System.out.print("Messaggio: ");
                    fromUser = stdIn.readLine();
                    toServer.println(fromUser);
                }

                while (!stringFromServer.equals("stop")) {
                    stringFromServer = fromServer.readLine();
                    if (!stringFromServer.equals("stop")) {
                        System.out.println("Server: " + stringFromServer);
                    }
                }

                /*
                 * fromServer.close(); stdIn.close(); toServer.close(); socket.close();
                 */
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}