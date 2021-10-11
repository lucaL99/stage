import java.util.Scanner;

public class eserciziCicli {

    public static void es1(Scanner k) {
        /*
         * Scrivere un programma / metodo che data una sequenza di interi stampi
         * "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari,
         * altrimenti stampa "NO". Risolvere questo esercizio senza usare array.
         */
        System.out.println("* ESERCIZIO 1 *");
        int num;
        boolean c = true;
        System.out.println("Inserisci 0 per terminare la sequenza");
        do {
            System.out.println("Inserisci un numero:");
            num = k.nextInt();
            if (num < 0) {
                c = false;
            }
        } while (num != 0);
        if (c) {
            System.out.println("Tutti positivi e pari");
        } else {
            System.out.println("NO");
        }
    }

    public static void es2(Scanner k) {
        /*
         * Scrivere un programma / metodo che data una sequenza di interi stampi la
         * media di tutti i numeri inseriti che siano divisibili per tre. Per esempio,
         * se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il risultato stampato dovrà
         * essere 9. Risolvere questo esercizio senza usare array.
         */
        System.out.println("* ESERCIZIO 2 *");
        int num, n = 0, somma = 0;
        double media;
        System.out.println("Inserisci 0 per terminare la sequenza");
        do {
            System.out.println("Inserisci un numero:");
            num = k.nextInt();
            if ((num != 0) && ((num % 3) == 0)) {
                somma = somma + num;
                n++;
            }
        } while (num != 0);
        if (n != 0) {
            media = somma / n;
            System.out.println(media);
        }

    }

    public static void es3(Scanner k) {
        /*
         * Scrivere un programma / metodo che chiede all’utente di inserire una sequenza
         * di caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa
         * man mano che vengono inseriti. L’intero procedimento (chiedere quanti
         * caratteri voglia inserire, leggere i caratteri e man mano stamparli) dovrà
         * essere ripetuto 5 volte. Risolvere questo esercizio senza usare array.
         */
        System.out.println("* ESERCIZIO 3 *");
        String c;
        int n;
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero di caratteri da inserire:");
            n = k.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.println("Inserisci un carattere:");
                c = k.next();
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("////////////// ESERCIZI CICLI //////////////");
        System.out.println("");
        es1(k);
        System.out.println("");
        es2(k);
        System.out.println("");
        es3(k);
    }
}