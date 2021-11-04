import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Application {
    public static void main(String[] args) {
        File f = new File("prova.jpg");
        try {
            FileOutputStream out = new FileOutputStream("cartella/" + f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}