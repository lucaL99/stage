import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Application {

    static LinkedList<Integer> mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        while (a.hasNext()) {
            lista.add(a.next());
        }
        while (b.hasNext()) {
            lista.add(b.next());
        }
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                int tmp = 0;
                if (lista.get(i) > lista.get(j)) {
                    tmp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, tmp);
                }
            }
        }
        return lista;
    }

    static void provaEx3() {
        LinkedList<Integer> lista1 = new LinkedList<Integer>();
        LinkedList<Integer> lista2 = new LinkedList<Integer>();
        LinkedList<Integer> listaMerge = new LinkedList<Integer>();
        int r1 = new Random().nextInt(10);
        int r2 = new Random().nextInt(100);
        lista1.add(r2);
        for (int i = 1; i < r1 - 1; i++) {
            r2 = new Random().nextInt(100);
            lista1.add(r2 + lista1.get(i - 1));
        }
        r2 = new Random().nextInt(100);
        lista2.add(r2);
        for (int i = 1; i < r1 - 1; i++) {
            r2 = new Random().nextInt(100);
            lista2.add(r2 + lista2.get(i - 1));
        }

        System.out.println("Lista 1");
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }
        System.out.println();
        System.out.println("Lista 2");

        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }
        System.out.println();

        listaMerge = mergeOrdinato(lista1.iterator(), lista2.iterator());

        System.out.println("Lista merge");
        for (int i = 0; i < listaMerge.size(); i++) {
            System.out.println(listaMerge.get(i));
        }

    }

    public static void main(String[] args) {
        provaEx3();
    }
}