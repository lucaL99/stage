import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;

public class Application {

    static ArrayList<Integer> creaRandom(int n, int max) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int r = 0;
        for (int i = 0; i < n; i++) {
            r = new Random().nextInt(max);
            lista.add(r);
        }
        return lista;
    }

    static void stampa(Iterator<Integer> i) {
        while (i.hasNext()) {
            System.out.println("<" + i.next() + ">");
        }
    }

    static void provaEx1() {
        stampa(creaRandom(20, 100).iterator());
    }

    public static void main(String[] args) {
        provaEx1();
    }
}