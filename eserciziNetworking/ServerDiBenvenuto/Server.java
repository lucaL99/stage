import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket acceptSocket = new ServerSocket(5200);
            while (true) {
                Socket clientSock = acceptSocket.accept();
                InputStream s = clientSock.getInputStream();
                BufferedReader input = new BufferedReader(new InputStreamReader(s));
                String line;
                int n = 0;
                while ((line = input.readLine()) != null) {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date date = new Date();
                    n++;
                    System.out.println("Ciao " + line + "!");
                    System.out.println("Data e ora: " + dateFormat.format(date));
                    System.out.println("Sei il visitatore numero " + n);
                    System.out.println();
                }
                input.close();
                s.close();
                clientSock.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
