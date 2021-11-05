import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.139", 5200);
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter toServer = new PrintWriter(socket.getOutputStream(), true);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader stdIn = new BufferedReader(isr);
            String citta, tempo, tempMin, tempMax;

            for (int i = 0; i < 5; i++) {
                System.out.print("Citta: ");
                citta = stdIn.readLine();
                toServer.println(citta);
                System.out.print("Tempo: ");
                tempo = stdIn.readLine();
                toServer.println(tempo);
                System.out.print("Temperatura minima: ");
                tempMin = stdIn.readLine();
                toServer.println(tempMin);
                System.out.print("Temperatura massima: ");
                tempMax = stdIn.readLine();
                toServer.println(tempMax);
            }
            System.out.println();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(fromServer.readLine() + " ");
                }
                System.out.println();
            }
            stdIn.close();
            isr.close();
            toServer.close();
            fromServer.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}