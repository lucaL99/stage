import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Application {

    static LinkedList<Integer> creaRandom(int n, int max) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
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