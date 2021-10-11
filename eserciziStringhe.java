import java.util.Scanner;

public class eserciziStringhe {
    public static void es1(String s1) {
        /*
         * Scrivere un programma / metodo che data una stringa in input la stampi al
         * contrario. Per esempio, se si immette la stringa "Viva Java", il programma
         * stampa "avaJ aviV"
         */
        System.out.println("* ESERCIZIO 1 *");
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }

    public static void es2(String s1) {
        /*
         * Scrivere un programma / metodo che data una stringa in input ne stampi le
         * sole vocali. Per esempio, se si immette la stringa "Viva Java", il programma
         * stampa "iaaa".
         */
        System.out.println("* ESERCIZIO 2 *");
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if ((s1.charAt(i) == 'A') || (s1.charAt(i) == 'a') || (s1.charAt(i) == 'E') || (s1.charAt(i) == 'e')
                    || (s1.charAt(i) == 'I') || (s1.charAt(i) == 'i') || (s1.charAt(i) == 'O') || (s1.charAt(i) == 'o')
                    || (s1.charAt(i) == 'U') || (s1.charAt(i) == 'u')) {
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.println(s2);
    }

    public static void es3() {
        /*
         * Scrivere un programma / metodo che data una sequenza di stringhe, conclusa
         * dalla stringa vuota, stampi la somma delle lunghezze delle stringhe che
         * iniziano con una lettera maiuscola. Per esempio, se si immettono le stringhe
         * "Albero", "foglia", "Radici", "Ramo", "fiore" (e poi "" per finire), il
         * programma stampa 16.
         */
        System.out.println("* ESERCIZIO 3 *");
        String s1;
        Scanner k = new Scanner(System.in);
        int cont = 0;
        System.out.println("Clicca invio per terminare la sequenza");
        do {
            System.out.println("Inserisci una stringa:");
            s1 = k.nextLine();
            if (s1.equals("")) {
                System.out.println(cont);
            } else if ((s1.charAt(0) >= 65) && (s1.charAt(0) <= 90)) {
                cont = cont + s1.length();
            }
        } while (!s1.equals(""));
    }

    public static void main(String[] args) {
        System.out.println("////////////// ESERCIZI STRINGHE //////////////");
        System.out.println("");
        es1("Viva Java");
        System.out.println("");
        es2("Viva Java");
        System.out.println("");
        es3();
    }
}