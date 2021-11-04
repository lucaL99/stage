import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("prova.txt");
            Scanner sc = new Scanner(f);
            Set<String> set = new HashSet<String>();
            while (sc.hasNext()) {
                set.add(sc.next());
            }
            System.out.println(set.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}