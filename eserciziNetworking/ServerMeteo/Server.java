import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Server {
    public static void main(String[] args) {

        String[][] mat = new String[5][4];
        // mat[0][0] = "prova";

        try {
            ServerSocket acceptSocket = new ServerSocket(5200);
            Socket socket = acceptSocket.accept();
            while (true) {
                InputStream s = socket.getInputStream();

                BufferedReader fromClient = new BufferedReader(new InputStreamReader(s));

                PrintWriter toClient = new PrintWriter(socket.getOutputStream(), true);

                InputStreamReader isr = new InputStreamReader(System.in);

                BufferedReader stdIn = new BufferedReader(isr);

                String citta;
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[i].length; j++) {
                        mat[i][j] = fromClient.readLine();
                    }
                }

                System.out.println("A quale citta inviare i dati meteo?");
                citta = stdIn.readLine();
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[i].length; j++) {
                        if (!mat[i][0].equals(citta)) {
                            toClient.println(mat[i][j]);
                        }

                    }
                }

                toClient.close();
                fromClient.close();
                stdIn.close();
                isr.close();
                s.close();
                socket.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
