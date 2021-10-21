import java.util.Scanner;

public class esercitazione1_1 {
    public static void es1() {
        /*
         * dato un array di interi, popolato casualmente, ordinarlo in ordine crescente
         * e stampare a video il risultato di tale ordinamento.
         */
        System.out.println("* ESERCIZIO 1 *");
        int l = (int) (Math.random() * 10 + 1);
        int[] array = new int[l];
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static boolean es2(String s) {
        /*
         * Scrivere un metodo che verifichi se una data stringa inserita in input è
         * palindroma, tale metodo dovrà restituire un booleano.
         */

        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void es3() {
        /*
         * Scrivere un metodo che mostri i primi 50 numeri della serie di fibonacci (i
         * primi due numeri di fibonacci sono 0 e 1 i successivi si calcolano come somma
         * dei 2 precedenti).
         */
        System.out.println("* ESERCIZIO 3 *");
        long n1 = 0, n2 = 0;
        for (int i = 0; i < 50; i++) {
            if ((i == 0)) {
                n1 = i;
                System.out.println(i);
            } else if (i == 1) {
                n2 = i;
                System.out.println(i);
            } else if ((i % 2) == 0) {
                n1 = n1 + n2;
                System.out.println(n1);
            } else {
                n2 = n2 + n1;
                System.out.println(n2);
            }

        }
    }

    public static void es4() {
        /* Data una matrice effettuare la trasposta della stessa. */
        System.out.println("* ESERCIZIO 4 *");
        int[][] m = { { 2, 4, 8 }, { 3, 2, 0 }, { 5, 3, 1 }, { 0, 1, 0 } };
        int[][] mT = new int[m[0].length][m.length];
        System.out.println("Matrice:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
                mT[j][i] = m[i][j];
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matrice trasposta:");
        for (int i = 0; i < mT.length; i++) {
            for (int j = 0; j < mT[i].length; j++) {
                System.out.print(mT[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        System.out.println("/////////// ESERCITAZIONE 1.1 ///////////");
        System.out.println("");

        es1();

        System.out.println("");
        System.out.println("* ESERCIZIO 2 *");
        Scanner k = new Scanner(System.in);
        String s;
        System.out.println("Inserisci una stringa: ");
        s = k.nextLine();
        if (es2(s)) {
            System.out.println("La stringa e' palindroma");
        } else {
            System.out.println("La stringa non e' palindroma");
        }

        System.out.println("");
        es3();

        System.out.println("");
        es4();

    }
}