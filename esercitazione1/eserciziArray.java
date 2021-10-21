import java.util.Random;

public class eserciziArray {

	public static void es1() {
		/*
		 * Scrivere un programma / metodo che preveda un array di 10 numeri interi
		 * contenente valori a piacere e ne stampa gli elementi secondo il seguente
		 * ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il
		 * terz’ultimo, ecc.
		 */
		System.out.println("* ESERCIZIO 1 *");
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i = 0;
		int j = array.length - 1;
		int k = 0;
		while (k < array.length) {
			if ((k % 2) == 0) {
				System.out.println(array[i]);
				i++;
			} else {
				System.out.println(array[j]);
				j--;
			}
			k++;
		}
	}

	public static void es2() {
		/*
		 * Scrivere un programma / metodo che preveda un array di 10 numeri interi
		 * contenente valori random. Tale programma dovrà stampare la dicitura
		 * "Pari e dispari uguali" se la somma dei numeri in posizioni pari dell’array è
		 * uguale alla somma dei numeri in posizioni dispari, altrimenti il programma
		 * dovrà stampare la dicitura "Pari e dispari diversi".
		 */
		System.out.println("* ESERCIZIO 2 *");
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.println(array[i]);
		}
		int sommaPari = 0, sommaDispari = 0;
		for (int i = 0; i < array.length; i++) {
			if ((i % 2) == 0) {
				sommaPari = sommaPari + array[i];
			} else {
				sommaDispari = sommaDispari + array[i];
			}
		}
		if (sommaPari == sommaDispari) {
			System.out.println("Pari e dispari uguali");
		} else {
			System.out.println("Pari e dispari diversi");
		}
	}

	public static void es3() {
		/*
		 * Scrivere un programma / metodo che preveda un array di 10 numeri interi
		 * contenente valori random e che stampi la dicitura
		 * "Tre valori consecutivi uguali" contiene tre valori uguali in tre posizioni
		 * consecutive, qualora la condizione non dovesse essere verificata dovrà
		 * stampare "NO".
		 */
		System.out.println("* ESERCIZIO 3 *");
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.println(array[i]);
		}
		boolean c = false;
		for (int i = 0; i < array.length; i++) {
			if (((i + 1) < array.length) && ((i + 2) < array.length)) {
				if ((array[i] == array[i + 1]) && (array[i + 1] == array[i + 2])) {
					c = true;
				}
			}
		}
		if (c) {
			System.out.println("Tre valori consecutivi uguali");
		} else {
			System.out.println("NO");
		}
	}

	public static void es4() {
		/*
		 * Scrivere un programma / metodo che date due sequenze di stringhe, ciascuna di
		 * 5 elementi, stampi il messaggio "OK" se almeno una stringa della prima
		 * sequenza compare anche nella seconda, altrimenti sarà stampato il messaggio
		 * "KO". Qualora vengano trovate due stringhe uguali i confronti tra le sequenze
		 * devono essere interrotti.
		 */
		System.out.println("* ESERCIZIO 4 *");
		String[] s1 = new String[] { "Tavolo", "Sedia", "Banana", "Porta", "Foglio" };
		String[] s2 = new String[] { "Cuffia", "Zaino", "Ciabatta", "Telefono", "Porta" };
		boolean c = true;
		for (int i = 0; i < s1.length && c; i++) {
			for (int j = 0; j < s2.length && c; j++) {
				if (s1[i].equals(s2[j])) {
					c = false;
				}
			}
		}
		if (c) {
			System.out.println("KO");
		} else {
			System.out.println("OK");
		}

	}

	public static void main(String[] args) {
		System.out.println("////////////// ESERCIZI ARRAY //////////////");
		System.out.println("");
		es1();
		System.out.println("");
		es2();
		System.out.println("");
		es3();
		System.out.println("");
		es4();
	}
}