import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket acceptSocket = new ServerSocket(5200);
            Socket socket = acceptSocket.accept();
            System.out.println("Digita 'stop' per far rispondere il destinatario");
            while (true) {

                InputStream s = socket.getInputStream();

                BufferedReader fromClient = new BufferedReader(new InputStreamReader(s));

                PrintWriter toClient = new PrintWriter(socket.getOutputStream(), true);

                InputStreamReader isr = new InputStreamReader(System.in);

                BufferedReader stdIn = new BufferedReader(isr);

                String inputLineFromClient = "", inputLineToClient = "";

                while (!inputLineFromClient.equals("stop")) {

                    inputLineFromClient = fromClient.readLine();
                    if (!inputLineFromClient.equals("stop")) {
                        System.out.println("Client: " + inputLineFromClient);
                    }
                }

                while (!inputLineToClient.equals("stop")) {
                    System.out.print("Messaggio: ");
                    inputLineToClient = stdIn.readLine();
                    toClient.println(inputLineToClient);
                }

                /*
                 * stdIn.close(); fromClient.close(); s.close(); socket.close();
                 */
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
