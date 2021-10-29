import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Application {

    static LinkedList<Integer> creaRandomCrescente(int n) {
        int r = new Random().nextInt(100);
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(r);
        for (int i = 1; i < n - 1; i++) {
            r = new Random().nextInt(100);
            lista.add(r + lista.get(i - 1));
        }
        return lista;
    }

    static LinkedList<Integer> parseString(Iterator<String> a) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        while (a.hasNext()) {
            try {
                lista.add(Integer.parseInt(a.next()));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    static void provaEx2() {
        LinkedList<Integer> lista1 = creaRandomCrescente(10);

        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i).intValue());
        }

        LinkedList<String> listaStringhe = new LinkedList<String>();

        listaStringhe.add("1");
        listaStringhe.add("2");
        listaStringhe.add("3");
        listaStringhe.add("4");
        listaStringhe.add("t");
        listaStringhe.add("6");
        listaStringhe.add("7");
        listaStringhe.add("8");
        listaStringhe.add("9");
        listaStringhe.add("10");

        LinkedList<Integer> lista2 = parseString(listaStringhe.iterator());

        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i).intValue());
        }

    }

    public static void main(String[] args) {
        provaEx2();
    }
}