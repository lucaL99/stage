import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            OutputStream fos = new FileOutputStream("prova.txt");
            PrintWriter pw = new PrintWriter(fos, true);
            double d = 2.4;
            pw.println(d);
            FileReader f = new FileReader("prova.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}