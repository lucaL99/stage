import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket sock = new Socket("192.168.1.139", 5200);
            PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader stdIn = new BufferedReader(isr);
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
            }
            stdIn.close();
            out.close();
            sock.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}