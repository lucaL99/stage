import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        FileReader file;
        try {
            file = new FileReader("prova.txt");
            Scanner sc = new Scanner(file);
            // sc = sc.useDelimiter("[ .,]+");
            while (sc.hasNext()) {
                System.out.print(sc.next() + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}