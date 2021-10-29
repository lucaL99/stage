import java.util.LinkedList;

public class Application {
    static LinkedList<LinkedList<Integer>> insiemeDiInsiemi(int n) {
        LinkedList<LinkedList<Integer>> insieme = new LinkedList<LinkedList<Integer>>();
        LinkedList<Integer> lista;
        for (int i = 0; i < n; i++) {
            lista = new LinkedList<Integer>();
            for (int j = 0; j <= i; j++) {
                lista.add(j);
            }
            insieme.add(lista);
        }
        return insieme;
    }

    static void stampa(LinkedList<LinkedList<Integer>> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public static void main(String[] args) {
        stampa(insiemeDiInsiemi(5));
    }
}