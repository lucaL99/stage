import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("prova.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1999, 10, 18);
            Date date = calendar.getTime();
            Impiegato i1 = new Impiegato("Luca", "Loddo", 30000, date);
            calendar.set(1990, 5, 4);
            date = calendar.getTime();
            Impiegato i2 = new Impiegato("Mario", "Rossi", 25000, date);
            oos.writeObject(i1);
            oos.writeObject(i2);
            FileInputStream fis = new FileInputStream("prova.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Impiegato i3 = (Impiegato) ois.readObject();
            Impiegato i4 = (Impiegato) ois.readObject();
            System.out.println(i3.toString());
            System.out.println(i4.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}